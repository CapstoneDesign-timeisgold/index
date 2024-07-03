package com.example.MapMarkerSetGet.service;

import com.example.MapMarkerSetGet.dto.MapMarkerSetGetDto;
import com.example.MapMarkerSetGet.domain.MapMarkerSetGet;
import com.example.MapMarkerSetGet.repository.MapMarkerSetGetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MapMarkerSetGetService {

    @Autowired
    private MapMarkerSetGetRepository mapMarkerSetGetRepository;

    public MapMarkerSetGet saveMapMarker(MapMarkerSetGetDto mapMarkerSetGetDto) {
        MapMarkerSetGet mapMarkerSetGet = new MapMarkerSetGet();
        mapMarkerSetGet.setLatitude(mapMarkerSetGetDto.getLatitude());
        mapMarkerSetGet.setLongitude(mapMarkerSetGetDto.getLongitude());
        return mapMarkerSetGetRepository.save(mapMarkerSetGet);
    }

    public MapMarkerSetGet getLatestMarker() {
        return mapMarkerSetGetRepository.findTopByOrderByIdDesc();
    }
}