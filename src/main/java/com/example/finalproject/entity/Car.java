package com.example.finalproject.entity;

import com.example.finalproject.enums.Status;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    private String brand;

    private String model;

    private String bodyType;

    private Integer year;

    private String colour;

    private Integer mileage;

    private Status status;

    private int amount;

//    @Lob
//    private String image;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;

//    @OneToMany(mappedBy = "car")
//    private List<Reservation> reservations;
}
