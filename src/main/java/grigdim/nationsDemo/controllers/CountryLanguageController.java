package grigdim.nationsDemo.controllers;

import grigdim.nationsDemo.entities.CountryLanguage;
import grigdim.nationsDemo.entities.CountryLanguageId;
import grigdim.nationsDemo.services.CountryLanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country-languages")
public class CountryLanguageController {

    @Autowired
    private CountryLanguageService countryLanguageService;

    @GetMapping
    public ResponseEntity<List<CountryLanguage>> getAllCountryLanguages() {
        List<CountryLanguage> countryLanguages = countryLanguageService.getAllCountryLanguages();
        return new ResponseEntity<>(countryLanguages, HttpStatus.OK);
    }

    @GetMapping("/{countryId}/{languageId}")
    public ResponseEntity<CountryLanguage> getCountryLanguageById(@PathVariable("countryId") int countryId, @PathVariable("languageId") int languageId) {
        CountryLanguageId id = new CountryLanguageId(countryId, languageId);
        CountryLanguage countryLanguage = countryLanguageService.getCountryLanguageById(id);
        if (countryLanguage == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(countryLanguage, HttpStatus.OK);
    }

}

