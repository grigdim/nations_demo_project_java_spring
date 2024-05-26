package grigdim.nationsDemo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "continents")
public class Continent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "continent_id", unique = true, nullable = false)
    private int continentId;

    @Column(name = "name", unique = true, nullable = false)
    private String continentName;

    @OneToMany(mappedBy = "regionContinent")
    private List<Region> regions;

    public Continent() {
    }

    public Continent(int continentId, String continentName, List<Region> regions) {
        this.continentId = continentId;
        this.continentName = continentName;
        this.regions = regions;
    }

    public int getContinentId() {
        return continentId;
    }

    public void setContinentId(int continentId) {
        this.continentId = continentId;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }
}
