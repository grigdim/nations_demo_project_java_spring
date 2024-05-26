package grigdim.nationsDemo.controllers;

import grigdim.nationsDemo.entities.CountryStats;
import grigdim.nationsDemo.entities.CountryStatsId;
import grigdim.nationsDemo.services.CountryStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/countrystats")
public class CountryStatsController {

    private final CountryStatsService countryStatsService;

    @Autowired
    public CountryStatsController(CountryStatsService countryStatsService) {
        this.countryStatsService = countryStatsService;
    }

    @GetMapping
    public ResponseEntity<List<CountryStats>> getAllCountryStats() {
        List<CountryStats> countryStatsList = countryStatsService.getAllCountryStats();
        return new ResponseEntity<>(countryStatsList, HttpStatus.OK);
    }

    @GetMapping("/{countryId}/{year}")
    public ResponseEntity<CountryStats> getCountryStatsById(@PathVariable int countryId, @PathVariable int year) {
        CountryStatsId id = new CountryStatsId(countryId, year);
        CountryStats countryStats = countryStatsService.getCountryStatsById(id);
        if (countryStats == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(countryStats, HttpStatus.OK);
    }

}

