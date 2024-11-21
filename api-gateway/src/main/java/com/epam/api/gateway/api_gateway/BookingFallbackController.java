package com.epam.api.gateway.api_gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("booking-fallback")
public class BookingFallbackController {
    @GetMapping
    public String fallback(){
        return "booking service is in maintenance mode. please come back later";
    }
}
