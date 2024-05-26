package grigdim.nationsDemo.repositories;

import grigdim.nationsDemo.entities.CountryStats;
import grigdim.nationsDemo.entities.CountryStatsId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryStatsRepository extends JpaRepository<CountryStats, CountryStatsId> {
}

