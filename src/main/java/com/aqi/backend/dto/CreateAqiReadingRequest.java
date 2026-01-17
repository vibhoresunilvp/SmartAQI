package com.aqi.backend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.Instant;

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

    public @NotBlank String getCity() {
        return this.city;
    }

    public String getArea() {
        return this.area;
    }

    public @NotNull Integer getAqi() {
        return this.aqi;
    }

    public String getMainPollutant() {
        return this.mainPollutant;
    }

    public String getSource() {
        return this.source;
    }

    public @NotNull Instant getTimestamp() {
        return this.timestamp;
    }

    public void setCity(@NotBlank String city) {
        this.city = city;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setAqi(@NotNull Integer aqi) {
        this.aqi = aqi;
    }

    public void setMainPollutant(String mainPollutant) {
        this.mainPollutant = mainPollutant;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setTimestamp(@NotNull Instant timestamp) {
        this.timestamp = timestamp;
    }
}
