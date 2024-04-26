package com.example.finalproject.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "reservations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateOfBooking;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Customer customer;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Car car;
    private LocalDate fromDate;
    private LocalDate toDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Branch loanBranch;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Branch returnBranch;
}
