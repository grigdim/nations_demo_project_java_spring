package grigdim.nationsDemo.services;

import grigdim.nationsDemo.entities.RegionArea;
import grigdim.nationsDemo.repositories.RegionAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegionAreaService {

    @Autowired
    private RegionAreaRepository regionAreaRepository;

    public List<RegionArea> getAllRegionAreas() {
        return regionAreaRepository.findAll();
    }

    public RegionArea getRegionAreaByName(String regionName) {
        Optional<RegionArea> optionalRegionArea = regionAreaRepository.findById(regionName);
        return optionalRegionArea.orElse(null);
    }

}

