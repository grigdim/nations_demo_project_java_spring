package grigdim.nationsDemo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "country_stats")
public class CountryStats {
    @EmbeddedId
    private CountryStatsId id;

    @Column(name = "population")
    private Integer population;

    @Column(name = "gdp")
    private Long gdp;

    @JsonIgnore
    @ManyToOne
    @MapsId("countryId")
    @JoinColumn(name = "country_id", referencedColumnName = "country_id", nullable = false, insertable = false, updatable = false, foreignKey = @ForeignKey(name = "country_stats_ibfk_1"))
    private Country country;

    public CountryStats() {
    }

    public CountryStats(CountryStatsId id, Integer population, Long gdp, Country country) {
        this.id = id;
        this.population = population;
        this.gdp = gdp;
        this.country = country;
    }

    public CountryStatsId getId() {
        return id;
    }

    public void setId(CountryStatsId id) {
        this.id = id;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Long getGdp() {
        return gdp;
    }

    public void setGdp(Long gdp) {
        this.gdp = gdp;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}

