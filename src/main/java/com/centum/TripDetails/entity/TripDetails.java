package com.centum.TripDetails.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "trip_details")

public class TripDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long tripid;
    public String destination;
    public String date;
    public String durationdays;
    public double price;
    @OneToMany
    private List<BookingDetails> bookingDetails;

}
