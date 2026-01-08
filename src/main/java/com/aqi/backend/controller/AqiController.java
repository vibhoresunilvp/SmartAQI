package com.aqi.backend.controller;

import com.aqi.backend.common.dto.ApiResponse;
import com.aqi.backend.dto.AqiReadingResponse;
import com.aqi.backend.dto.CreateAqiReadingRequest;
import com.aqi.backend.service.AqiService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;

@Controller
@RequestMapping("/api/v1/aqi")
public class AqiController {

    private final AqiService aqiService;

    public AqiController(AqiService aqiService) {
        this.aqiService = aqiService;
    }

    @GetMapping("/current")
    public ResponseEntity<ApiResponse<AqiReadingResponse>> getCurrentAqi(
            @RequestParam String city
    ) {
        return aqiService.getCurrentAqi(city)
                .map(dto -> ResponseEntity.ok(ApiResponse.success(dto)))
                .orElse(ResponseEntity.badRequest().build());
    }

    @GetMapping("/history")
    public ResponseEntity<ApiResponse<Page<AqiReadingResponse>>> getHistory(
            @RequestParam String city,
            @RequestParam(required = false) String from,
            @RequestParam(required = false) String to,
            Pageable pageable) {
        Instant fromInstant = (from != null) ? Instant.parse(from) : Instant.EPOCH;
        Instant toInstant = (to != null) ? Instant.parse(to) : Instant.now();
        Page<AqiReadingResponse> page = aqiService.getHistory(city, fromInstant, toInstant, pageable);
        return ResponseEntity.ok(ApiResponse.success(page));
    }

    @PostMapping
    public ResponseEntity<ApiResponse<AqiReadingResponse>> createReading(
            @Valid @RequestBody CreateAqiReadingRequest request
            ) {
        AqiReadingResponse created = aqiService.createReading(request);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(ApiResponse.success(created));
    }
}