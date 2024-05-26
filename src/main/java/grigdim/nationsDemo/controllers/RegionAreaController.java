package grigdim.nationsDemo.controllers;

import grigdim.nationsDemo.entities.RegionArea;
import grigdim.nationsDemo.services.RegionAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/regionareas")
public class RegionAreaController {

    @Autowired
    private RegionAreaService regionAreaService;

    @GetMapping
    public ResponseEntity<List<RegionArea>> getAllRegionAreas() {
        List<RegionArea> regionAreas = regionAreaService.getAllRegionAreas();
        return new ResponseEntity<>(regionAreas, HttpStatus.OK);
    }

    @GetMapping("/{regionName}")
    public ResponseEntity<RegionArea> getRegionAreaByName(@PathVariable String regionName) {
        RegionArea regionArea = regionAreaService.getRegionAreaByName(regionName);
        if (regionArea != null) {
            return new ResponseEntity<>(regionArea, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

