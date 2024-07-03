package com.example.MapMarkerSetGet.repository;

import com.example.MapMarkerSetGet.domain.MapMarkerSetGet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MapMarkerSetGetRepository extends JpaRepository<MapMarkerSetGet, Long> {
    MapMarkerSetGet findTopByOrderByIdDesc();
}