package com.centum.TripDetails.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "booking_details")


public class BookingDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long bookingid;
    public String destination, from, date, time;
    public String travellingmode;
    @NotNull
    public int noofbookings;
    public double totalprice;
    @ManyToOne
    @JoinColumn(name = "fk_user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "fk_trip_id")
    private TripDetails tripDetails;
    @OneToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;
    private String bookingReference;


    // @OneToOne
    //private Payment payment;
}
