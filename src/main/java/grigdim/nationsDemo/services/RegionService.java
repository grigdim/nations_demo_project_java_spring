package grigdim.nationsDemo.services;

import grigdim.nationsDemo.entities.Region;
import grigdim.nationsDemo.repositories.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {

    @Autowired
    private RegionRepository regionRepository;

    public List<Region> getAllRegions() {
        return regionRepository.findAll();
    }

    public Region getRegionById(int id) {
        return regionRepository.findById(id).orElse(null);
    }
}
