package com.centum.TripDetails.controller;

import com.centum.TripDetails.entity.Payment;
import com.centum.TripDetails.entity.User;
import com.centum.TripDetails.repository.PaymentRepo;
import com.centum.TripDetails.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class PaymentController {
    @Autowired
    public PaymentRepo paymentRepository;
    @PostMapping
    public ResponseEntity<String> savePayments(@RequestBody List<Payment> payments){
        paymentRepository.saveAll(payments);
        return ResponseEntity.ok("payment details saved successfully");
    }
}
