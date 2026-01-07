package com.aqi.backend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class CreateAqiReadingRequest {
    @NotBlank
    private String city;
    private String area;
    @NotNull
    private Integer aqi;
    private String mainPollutant;
    private String source;
    @NotNull
    private Instant timestamp;
}
