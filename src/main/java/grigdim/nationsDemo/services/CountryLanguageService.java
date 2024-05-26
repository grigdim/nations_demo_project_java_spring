package grigdim.nationsDemo.services;

import grigdim.nationsDemo.entities.CountryLanguage;
import grigdim.nationsDemo.entities.CountryLanguageId;
import grigdim.nationsDemo.repositories.CountryLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryLanguageService {

    @Autowired
    private CountryLanguageRepository countryLanguageRepository;

    public List<CountryLanguage> getAllCountryLanguages() {
        return countryLanguageRepository.findAll();
    }

    public CountryLanguage getCountryLanguageById(CountryLanguageId id) {
        return countryLanguageRepository.findById(id).orElse(null);
    }
}

