package com.centum.TripDetails.controller;

import com.centum.TripDetails.entity.BookingDetails;
import com.centum.TripDetails.entity.User;
import com.centum.TripDetails.repository.BookingDetailsRepo;
import com.centum.TripDetails.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class BookingDetailsController {
    @Autowired
    public BookingDetailsRepo bookingDetailsRepository;
    @PostMapping
    public ResponseEntity<String> saveBookings(@RequestBody List<BookingDetails> bookings){
        bookingDetailsRepository.saveAll(bookings);
        return ResponseEntity.ok("booking details saved successfully");
    }
}
