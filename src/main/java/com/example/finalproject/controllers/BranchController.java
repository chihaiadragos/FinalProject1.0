package com.example.finalproject.controllers;

import com.example.finalproject.entities.Branch;
import com.example.finalproject.entities.Car;
import com.example.finalproject.services.BranchService;
import com.example.finalproject.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/branch")
public class BranchController {

    private final BranchService branchService;

    @PostMapping
    public ResponseEntity<Branch> create(@RequestBody Branch branch) {
        return new ResponseEntity<>(branchService.create(branch), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Branch> get(@PathVariable Long id) {
        Branch foundBranch = branchService.getById(id);
        if (foundBranch == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(foundBranch, HttpStatus.FOUND);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Branch> update(@PathVariable Long id, @RequestBody Branch branch) {
        Branch updatedBranch = branchService.update(id, branch);
        if (updatedBranch == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(updatedBranch, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        Branch deletedBranch = branchService.delete(id);
        if (deletedBranch == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Branch>> getAll() {
        return new ResponseEntity<>(branchService.getAll(), HttpStatus.OK);
    }

}
