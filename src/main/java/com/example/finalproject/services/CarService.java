package com.example.finalproject.services;

import com.example.finalproject.entities.Branch;
import com.example.finalproject.entities.Car;
import com.example.finalproject.repositories.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public Car create(Car car) {
        return carRepository.save(car);
    }

    public Car getById(Long id) {
        Optional<Car> foundCar = carRepository.findById(id);
        if (foundCar.isEmpty()) {
            return null;
        }
        return foundCar.get();
    }
    public Car update(Long id, Car car) {
        Car updatedCar = getById(id);

        updatedCar.setBrand(car.getBrand());
        updatedCar.setModel(car.getModel());
        updatedCar.setBodyType(car.getBodyType());
        updatedCar.setYearOfProduction(car.getYearOfProduction());
        updatedCar.setColor(car.getColor());
        updatedCar.setMileAge(car.getMileAge());
        updatedCar.setAmount(car.getAmount());
        updatedCar.setImageUrl(car.getImageUrl());
        updatedCar.setStatusAvailabilityCar(car.getStatusAvailabilityCar());

        return carRepository.save(updatedCar);
    }

    public Car delete(Long id) {
        Car deletedCar = getById(id);
        carRepository.deleteById(id);
        return deletedCar;
    }

    public List<Car> getAll(){
        return carRepository.findAll();
    }

    public List<Car> getCarsByBranch(Branch branch) {
        return carRepository.findAllByBranch(branch);
    }

}
