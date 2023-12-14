package com.centum.TripDetails.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "payment")


public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long paymentid;
    public String destination, from, date, time;
    public String travellingmode;
    public int noofbookings;
    public double amountpaid;
    @OneToOne
    @JoinColumn(name = "fk_booking_details_id")
    private BookingDetails bookingDetails;

    //@OneToOne
   // private User user;

}