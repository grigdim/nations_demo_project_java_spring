package grigdim.nationsDemo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "regions")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "region_id", unique = true, nullable = false)
    private int regionId;

    @Column(name = "name", unique = true, nullable = false)
    private String regionName;

    @OneToMany(mappedBy = "countryRegion")
    private List<Country> countries;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "continent_id", referencedColumnName = "continent_id", nullable = false)
    private Continent regionContinent;

    public Region() {
    }

    public Region(int regionId, String regionName, List<Country> countries, Continent regionContinent) {
        this.regionId = regionId;
        this.regionName = regionName;
        this.countries = countries;
        this.regionContinent = regionContinent;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public Continent getRegionContinent() {
        return regionContinent;
    }

    public void setRegionContinent(Continent regionContinent) {
        this.regionContinent = regionContinent;
    }
}
