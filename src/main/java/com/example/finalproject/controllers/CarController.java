package com.example.finalproject.controllers;

import com.example.finalproject.entities.Branch;
import com.example.finalproject.entities.Car;
import com.example.finalproject.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/car")
public class CarController {

    private final CarService carService;

    @PostMapping
    public ResponseEntity<Car> create(@RequestBody Car car) {
        return new ResponseEntity<>(carService.create(car), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> get(@PathVariable Long id) {
        Car foundCar = carService.getById(id);
        if (foundCar == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(foundCar, HttpStatus.FOUND);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Car> update(@PathVariable Long id, @RequestBody Car car) {
        Car updatedCar = carService.update(id, car);
        if (updatedCar == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(updatedCar, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        Car deletedCar = carService.delete(id);
        if (deletedCar == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Car>> getAll() {
        return new ResponseEntity<>(carService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/byBranch")
    public ResponseEntity<List<Car>> getCarsByBranch(@RequestBody Branch branch) {
        return new ResponseEntity<>(carService.getCarsByBranch(branch), HttpStatus.OK);

    }
}
