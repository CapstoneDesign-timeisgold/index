package com.example.MapMarkerSetGet.controller;
//Marker get Con - 사용자가 저장한 DB 내 좌표데이터 불러오기

import com.example.MapMarkerSetGet.dto.MapMarkerSetGetDto;
import com.example.MapMarkerSetGet.domain.MapMarkerSetGet;
import com.example.MapMarkerSetGet.service.MapMarkerSetGetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/showpromise")
public class MarkerGetController {

    @Autowired
    private MapMarkerSetGetService mapMarkerSetGetService;

    @GetMapping("/latest")
    public MapMarkerSetGet getLatestMapCon() {
        return mapMarkerSetGetService.getLatestMarker();
    }
}
