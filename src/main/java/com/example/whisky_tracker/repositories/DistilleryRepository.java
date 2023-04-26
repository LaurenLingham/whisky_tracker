package com.example.whisky_tracker.repositories;

import com.example.whisky_tracker.models.Distillery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistilleryRepository extends JpaRepository<Distillery, Long> {
    List<Distillery> findByRegion(String region);
    List<Distillery> findByWhiskiesAge(int age);
}
