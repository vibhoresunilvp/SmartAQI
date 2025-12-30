package com.aqi.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(
        indexes = @Index(name = "idx_city_time", columnList = "city,timestamp")
)
@Data
public class AqiData {
    @Id
    @GeneratedValue
    private Long id;
    private String city;
    private int aqi;
    private LocalDateTime timestamp;
}
