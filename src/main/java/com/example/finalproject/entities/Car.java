package com.example.finalproject.entities;

import com.example.finalproject.enums.StatusAvailabilityCar;
import jakarta.persistence.*;
import lombok.*;

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
//    private Branch branch;
//    private List<Reservation> reservation = new List<Reservation>();
//





}
