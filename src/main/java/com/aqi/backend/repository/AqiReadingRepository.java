package com.aqi.backend.repository;

import com.aqi.backend.entity.AqiData;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface AqiReadingRepository extends JpaRepository<AqiData, Long> {

    Page<AqiData> findByCity(
            String city, Pageable pageable
    );
}
