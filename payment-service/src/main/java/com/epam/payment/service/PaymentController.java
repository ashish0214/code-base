package com.epam.payment.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payments")
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @GetMapping
    public String pay(){
        return "payment is successful from instance : "+ port;
    }

}
