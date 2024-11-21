package com.epam.booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bookings")
public class BookingController {
    @Autowired
    PaymentServiceBroker paymentServiceBroker;
    @GetMapping
    public String book(){
        return paymentServiceBroker.pay();
    }

}
