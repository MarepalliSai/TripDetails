package com.centum.TripDetails.repository;

import com.centum.TripDetails.entity.BookingDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDetailsRepo extends JpaRepository<BookingDetails, Long> {
}
