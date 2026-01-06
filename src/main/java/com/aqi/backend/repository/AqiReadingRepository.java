package com.aqi.backend.repository;

import com.aqi.backend.model.AqiReading;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Instant;
import java.util.Optional;

public interface AqiReadingRepository extends JpaRepository<AqiReading, Long> {

    Optional<AqiReading> findTopByCityOrderByTimestampDesc(String city);

    Page<AqiReading> findByCityAndTimestampBetween(
            String city,
            Instant from,
            Instant to,
            Pageable pageable
    );
}
