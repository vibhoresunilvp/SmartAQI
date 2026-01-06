package com.aqi.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AqiReadingResponse {
    private Long id;
    private String city;
    private String area;
    private Integer aqi;
    private String mainPollutant;
    private String source;
    private Instant timestamp;
}
