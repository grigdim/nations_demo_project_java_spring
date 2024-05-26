package grigdim.nationsDemo.services;

import grigdim.nationsDemo.entities.Language;
import grigdim.nationsDemo.repositories.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {

    @Autowired
    private LanguageRepository languageRepository;

    public List<Language> getAllLanguages() {
        return languageRepository.findAll();
    }

    public Language getLanguageById(int id) {
        return languageRepository.findById(id).orElse(null);
    }

}

