package com.centum.TripDetails.repository;

import com.centum.TripDetails.entity.TripDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripDetailsRepo extends JpaRepository<TripDetails, Long> {
}
