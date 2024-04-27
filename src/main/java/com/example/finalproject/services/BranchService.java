package com.example.finalproject.services;

import com.example.finalproject.entities.Branch;
import com.example.finalproject.entities.Car;
import com.example.finalproject.repositories.BranchRepository;
import com.example.finalproject.repositories.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BranchService {

    private final BranchRepository branchRepository;

    public Branch create(Branch branch) {
        return branchRepository.save(branch);
    }

    public Branch getById(Long id) {
        Optional<Branch> foundCar = branchRepository.findById(id);
        if (foundCar.isEmpty()) {
            return null;
        }
        return foundCar.get();
    }
    public Branch update(Long id, Branch branch) {
        Branch updatedBranch = getById(id);

        updatedBranch.setBranchName(branch.getBranchName());
        updatedBranch.setCity(branch.getCity());
        updatedBranch.setAddress(branch.getAddress());

        return branchRepository.save(updatedBranch);
    }

    public Branch delete(Long id) {
        Branch deletedCar = getById(id);
        branchRepository.deleteById(id);
        return deletedCar;
    }

    public List<Branch> getAll(){
        return branchRepository.findAll();
    }


}
