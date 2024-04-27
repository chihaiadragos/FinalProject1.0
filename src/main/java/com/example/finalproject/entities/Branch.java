package com.example.finalproject.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "branches")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Builder
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String branchName;
    private String city;
    private String address;
    @OneToMany(mappedBy = "branch", fetch = FetchType.EAGER)
    private List<Car> cars;
    @OneToMany(mappedBy = "branch")
    private List<Employee> employees;

}
