package com.centum.TripDetails.controller;

import com.centum.TripDetails.entity.TripDetails;
import com.centum.TripDetails.entity.User;
import com.centum.TripDetails.repository.TripDetailsRepo;
import com.centum.TripDetails.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class TripDetailsController {
    @Autowired
    public TripDetailsRepo tripDetailsRepository;
    @PostMapping
    public ResponseEntity<String> saveTripDetails(@RequestBody List<TripDetails> tripDetails){
        tripDetailsRepository.saveAll(tripDetails);
        return ResponseEntity.ok("Trip details saved successfully");
    }
}
