package com.example.finalproject.entity;

import com.example.finalproject.enums.Position;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    private String firstName;
    private String lastName;
    private Position position;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;
}
