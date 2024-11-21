package com.epam.booking.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "payment-service")
public interface PaymentServiceBroker {
    @GetMapping("/payments")
    String pay();
}
