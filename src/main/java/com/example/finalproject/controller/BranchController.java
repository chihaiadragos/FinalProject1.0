package com.example.finalproject.controller;

import com.example.finalproject.entity.Branch;
import com.example.finalproject.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/branch")
public class BranchController {
    private final BranchService branchService;
@Autowired
    public BranchController(BranchService branchService) {
        this.branchService = branchService;
    }

    @PostMapping
    public ResponseEntity<Branch> save(@RequestBody Branch branch) {
        return new ResponseEntity<>(branchService.save(branch), HttpStatus.OK);
    }
}
