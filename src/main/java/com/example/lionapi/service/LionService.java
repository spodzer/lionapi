package com.example.lionapi.service;

import com.example.lionapi.entity.Lion;
import com.example.lionapi.repository.LionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LionService {

    @Autowired
    private LionRepository lionRepository;

    public List<Lion> getAllLions() {
        return lionRepository.findAll();
    }

    public Optional<Lion> getLionById(int lionId) {
        return lionRepository.findById(lionId);
    }

    public Lion saveLion(Lion lion) {
        return lionRepository.save(lion);
    }

    public void deleteLion(int lionId) {
        lionRepository.deleteById(lionId);
    }
}
