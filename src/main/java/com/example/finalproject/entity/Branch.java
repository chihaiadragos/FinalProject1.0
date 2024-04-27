package com.example.finalproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    private String city;
    private String address;
    private String name;

    @OneToMany(mappedBy = "branch")
    private List<Car> availableCars;

    @OneToMany(mappedBy = "branch")
    private List<Employee> employees;

//    @OneToOne
//    private Employee manager;
//
//    @OneToMany(mappedBy = "branch")
//    private List<Rental> rentals;
}
