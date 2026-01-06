package com.aqi.backend.service;

import com.aqi.backend.dto.AqiResponse;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@EnableCaching
public class AqiService {

    @Cacheable(value = "aqiCurrent", key = "#city")
    public AqiResponse getCurrent(String city) {
        return new AqiResponse("Delhi", 400, LocalDateTime.now());
    }

    public Page<AqiResponse> getHistory(String city, Pageable pageable) {
        return null;
    }
}
