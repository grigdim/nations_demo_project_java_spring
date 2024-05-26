package grigdim.nationsDemo.services;

import grigdim.nationsDemo.entities.CountryStats;
import grigdim.nationsDemo.entities.CountryStatsId;
import grigdim.nationsDemo.repositories.CountryStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CountryStatsService {

    @Autowired
    private CountryStatsRepository countryStatsRepository;

    public List<CountryStats> getAllCountryStats() {
        return countryStatsRepository.findAll();
    }

    public CountryStats getCountryStatsById(CountryStatsId id) {
        return countryStatsRepository.findById(id).orElse(null);
    }

}

