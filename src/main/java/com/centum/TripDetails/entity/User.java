package com.centum.TripDetails.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Trip_table")


public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long Userid;
    public String username;
    public String useremail;
    public String usermobile;
    public String useraddress;
    @OneToMany
    private List<BookingDetails> bookingDetails;
    @OneToMany
    private List<TripDetails> TripDetails;
}
