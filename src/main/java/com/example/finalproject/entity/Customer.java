package com.example.finalproject.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String address;

//    @OneToMany(mappedBy = "client")
//    private List<Reservation> reservations;
}
