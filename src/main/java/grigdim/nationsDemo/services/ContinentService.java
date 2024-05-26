package grigdim.nationsDemo.services;

import grigdim.nationsDemo.entities.Continent;
import grigdim.nationsDemo.repositories.ContinentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinentService {

    @Autowired
    private ContinentRepository continentRepository;

    public List<Continent> getAllContinents() {
        return continentRepository.findAll();
    }

    public Continent getContinentById(int id) {
        return continentRepository.findById(id).orElse(null);
    }

}
