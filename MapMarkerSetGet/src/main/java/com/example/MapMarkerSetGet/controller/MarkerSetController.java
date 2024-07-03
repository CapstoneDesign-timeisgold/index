package com.example.MapMarkerSetGet.controller;


import com.example.MapMarkerSetGet.domain.MapMarkerSetGet;
import com.example.MapMarkerSetGet.dto.MapMarkerSetGetDto;
import com.example.MapMarkerSetGet.service.MapMarkerSetGetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apromisesetup")
public class MarkerSetController {
    @Autowired
    private MapMarkerSetGetService mapMarkerSetGetService;

    @PostMapping
    public MapMarkerSetGet saveMarker(@RequestBody MapMarkerSetGetDto mapMarkerSetGetDto) {
        return mapMarkerSetGetService.saveMapMarker(mapMarkerSetGetDto);
    }
}