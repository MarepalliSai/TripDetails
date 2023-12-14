package com.centum.TripDetails.controller;


import com.centum.TripDetails.entity.BookingDetails;
import com.centum.TripDetails.entity.User;
import com.centum.TripDetails.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping

public class UserController {
    @Autowired
    public UserRepo userRepository;
    @PostMapping
    public ResponseEntity<String> saveUsers(@RequestBody List<User> users){
        userRepository.saveAll(users);
        return ResponseEntity.ok("User details saved successfully");
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
        Optional<User> userOptional = userRepository.findById(id);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            return ResponseEntity.ok(user);
        } else {
            // Handle the case where the user with the given ID is not found
            return ResponseEntity.notFound().build();
        }
    }

}

