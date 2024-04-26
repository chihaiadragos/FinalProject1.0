package com.example.finalproject.entities;

import com.example.finalproject.enums.UserRole;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private UserRole userRole;
    @ManyToOne
    @JoinColumn
    private Branch branch;


}
