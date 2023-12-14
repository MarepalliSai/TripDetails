package com.centum.TripDetails.repository;

import com.centum.TripDetails.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
