package com.example.finalproject.repositories;

import com.example.finalproject.entities.Branch;
import com.example.finalproject.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BranchRepository extends JpaRepository<Branch, Long> {


}
