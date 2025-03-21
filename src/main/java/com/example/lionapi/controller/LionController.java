package com.example.lionapi.controller;

import com.example.lionapi.entity.Lion;
import com.example.lionapi.service.LionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("lions")
public class LionController {

    @Autowired
    private LionService lionService;

    @GetMapping
    public List<Lion> getAllLions() {
        return lionService.getAllLions();
    }

    @GetMapping("/{lionId}")
    public ResponseEntity<Lion> getLionById(@PathVariable int lionId) {
        Optional<Lion> lion = lionService.getLionById(lionId);
        return lion.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PostMapping
    public ResponseEntity<Lion> createLion(@RequestBody Lion lion) {
        Lion savedLion = lionService.saveLion(lion);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedLion);
    }

    @DeleteMapping("/{lionId}")
    public ResponseEntity<Void> deleteLion(@PathVariable int lionId) {
        lionService.deleteLion(lionId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
