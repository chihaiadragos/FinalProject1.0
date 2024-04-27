package com.example.finalproject.service;

import com.example.finalproject.entity.Branch;
import com.example.finalproject.entity.Car;
import com.example.finalproject.repository.BranchRepository;
import com.example.finalproject.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    private final CarRepository carRepository;
    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car save(Car car) {
        return carRepository.save(car);
    }
}
