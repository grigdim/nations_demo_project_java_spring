package grigdim.nationsDemo.repositories;

import grigdim.nationsDemo.entities.CountryLanguage;
import grigdim.nationsDemo.entities.CountryLanguageId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, CountryLanguageId> {
}

