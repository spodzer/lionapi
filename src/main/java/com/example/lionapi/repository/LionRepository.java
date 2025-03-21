package com.example.lionapi.repository;

import com.example.lionapi.entity.Lion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LionRepository extends JpaRepository<Lion, Integer> {
}
