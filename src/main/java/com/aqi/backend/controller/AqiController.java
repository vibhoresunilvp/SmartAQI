package com.aqi.backend.controller;

import com.aqi.backend.dto.AqiResponse;
import com.aqi.backend.service.AqiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api/v1/aqi")
public class AqiController {

    @Autowired
    private AqiService aqiService;

    public AqiResponse current(@RequestParam String city) {
        return aqiService.getCurrent(city);
    }

    @GetMapping("/history")
    public Page<AqiResponse> history(@RequestParam String city, Pageable pageable) {
        return aqiService.getHistory(city, pageable);
    }
}
