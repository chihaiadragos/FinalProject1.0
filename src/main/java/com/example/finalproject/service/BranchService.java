package com.example.finalproject.service;

import com.example.finalproject.entity.Branch;
import com.example.finalproject.repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BranchService {
    private final BranchRepository branchRepository;
    @Autowired
    public BranchService(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }

    public Branch save(Branch branch) {
        return branchRepository.save(branch);
    }
}
