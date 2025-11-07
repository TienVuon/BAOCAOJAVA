package com.evrental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.evrental.service.PaymentService;
import com.evrental.model.Payment;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/process")
    public Payment processPayment(@RequestBody Payment payment) {
        return paymentService.processPayment(payment);
    }

    @GetMapping("/status/{id}")
    public Payment getPaymentStatus(@PathVariable Long id) {
        return paymentService.getPaymentStatus(id);
    }
}
