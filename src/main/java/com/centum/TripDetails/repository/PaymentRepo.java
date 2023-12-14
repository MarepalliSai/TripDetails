package com.centum.TripDetails.repository;

import com.centum.TripDetails.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment, Long> {
}
