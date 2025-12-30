package com.aqi.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class AqiResponse {
    private String city;
    private int aqi;
    private LocalDateTime timestamp;
}
