package com.example.finalproject.entities;

import com.example.finalproject.enums.StatusAvailabilityCar;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cars")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private String bodyType;
    private Integer yearOfProduction;
    private String color;
    private Integer mileAge;
    private Double amount;
    private String imageUrl;
    private StatusAvailabilityCar statusAvailabilityCar;
    @ManyToOne
    @JoinColumn
    private Branch branch;
    @OneToMany(mappedBy = "car")
    private List<Reservation> reservation;






}
