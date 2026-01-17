package com.aqi.backend.model;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "aqi_readings")
public class AqiReading {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String area;
    private Integer aqi;
    private String mainPollutant;
    private String source;
    private Instant timestamp;
    private Instant createdAt;

    public AqiReading() {
    }

    public Long getId() {
        return this.id;
    }

    public String getCity() {
        return this.city;
    }

    public String getArea() {
        return this.area;
    }

    public Integer getAqi() {
        return this.aqi;
    }

    public String getMainPollutant() {
        return this.mainPollutant;
    }

    public String getSource() {
        return this.source;
    }

    public Instant getTimestamp() {
        return this.timestamp;
    }

    public Instant getCreatedAt() {
        return this.createdAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setAqi(Integer aqi) {
        this.aqi = aqi;
    }

    public void setMainPollutant(String mainPollutant) {
        this.mainPollutant = mainPollutant;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AqiReading)) return false;
        final AqiReading other = (AqiReading) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$city = this.getCity();
        final Object other$city = other.getCity();
        if (this$city == null ? other$city != null : !this$city.equals(other$city)) return false;
        final Object this$area = this.getArea();
        final Object other$area = other.getArea();
        if (this$area == null ? other$area != null : !this$area.equals(other$area)) return false;
        final Object this$aqi = this.getAqi();
        final Object other$aqi = other.getAqi();
        if (this$aqi == null ? other$aqi != null : !this$aqi.equals(other$aqi)) return false;
        final Object this$mainPollutant = this.getMainPollutant();
        final Object other$mainPollutant = other.getMainPollutant();
        if (this$mainPollutant == null ? other$mainPollutant != null : !this$mainPollutant.equals(other$mainPollutant))
            return false;
        final Object this$source = this.getSource();
        final Object other$source = other.getSource();
        if (this$source == null ? other$source != null : !this$source.equals(other$source)) return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        final Object this$createdAt = this.getCreatedAt();
        final Object other$createdAt = other.getCreatedAt();
        if (this$createdAt == null ? other$createdAt != null : !this$createdAt.equals(other$createdAt)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AqiReading;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $city = this.getCity();
        result = result * PRIME + ($city == null ? 43 : $city.hashCode());
        final Object $area = this.getArea();
        result = result * PRIME + ($area == null ? 43 : $area.hashCode());
        final Object $aqi = this.getAqi();
        result = result * PRIME + ($aqi == null ? 43 : $aqi.hashCode());
        final Object $mainPollutant = this.getMainPollutant();
        result = result * PRIME + ($mainPollutant == null ? 43 : $mainPollutant.hashCode());
        final Object $source = this.getSource();
        result = result * PRIME + ($source == null ? 43 : $source.hashCode());
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        final Object $createdAt = this.getCreatedAt();
        result = result * PRIME + ($createdAt == null ? 43 : $createdAt.hashCode());
        return result;
    }

    public String toString() {
        return "AqiReading(id=" + this.getId() + ", city=" + this.getCity() + ", area=" + this.getArea() + ", aqi=" + this.getAqi() + ", mainPollutant=" + this.getMainPollutant() + ", source=" + this.getSource() + ", timestamp=" + this.getTimestamp() + ", createdAt=" + this.getCreatedAt() + ")";
    }
}
