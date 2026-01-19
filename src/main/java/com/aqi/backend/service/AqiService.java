package com.aqi.backend.service;

import com.aqi.backend.dto.AqiReadingResponse;
import org.springframework.cache.annotation.CacheEvict;
import com.aqi.backend.dto.CreateAqiReadingRequest;
import com.aqi.backend.model.AqiReading;
import com.aqi.backend.repository.AqiReadingRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
@EnableCaching
public class AqiService {

    private final AqiReadingRepository aqiReadingRepository;

    public AqiService(AqiReadingRepository aqiReadingRepository) {
        this.aqiReadingRepository = aqiReadingRepository;
    }

    @Cacheable(cacheNames = "currentAqi", key = "#city")
    public Optional<AqiReadingResponse> getCurrentAqi(String city) {
        return aqiReadingRepository.findTopByCityOrderByTimestampDesc(city)
                .map(this::mapToResponse);
    }

    public Page<AqiReadingResponse> getHistory(String city, Instant from, Instant to, Pageable pageable) {
        return aqiReadingRepository.findByCityAndTimestampBetween(city, from, to, pageable)
                .map(this::mapToResponse);
    }

    @CacheEvict(cacheNames = "currentAqi", key = "#request.city")
    public AqiReadingResponse createReading(CreateAqiReadingRequest request) {
        AqiReading entity = new AqiReading();
        entity.setCity(request.getCity());
        entity.setArea(request.getArea());
        entity.setAqi(request.getAqi());
        entity.setMainPollutant(request.getMainPollutant());
        entity.setSource(request.getSource());
        entity.setTimestamp(request.getTimestamp());
        entity.setCreatedAt(Instant.now());
        AqiReading saved = aqiReadingRepository.save(entity);
        return mapToResponse(saved);
    }

    private AqiReadingResponse mapToResponse(AqiReading entity) {
        AqiReadingResponse dto = new AqiReadingResponse();
        dto.setId(entity.getId());
        dto.setCity(entity.getCity());
        dto.setArea(entity.getArea());
        dto.setAqi(entity.getAqi());
        dto.setMainPollutant(entity.getMainPollutant());
        dto.setSource(entity.getSource());
        dto.setTimestamp(entity.getTimestamp());
        return dto;
    }
}
