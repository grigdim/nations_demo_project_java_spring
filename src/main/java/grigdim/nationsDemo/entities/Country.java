package grigdim.nationsDemo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id", unique = true, nullable = false)
    private int countryId;

    @Column(name = "name", unique = true)
    private String countryName;

    @Column(name = "area", nullable = false, precision = 10, scale = 2)
    private BigDecimal countryArea;

    @Column(name = "national_day")
    private Date countryNationalDay;

    @Column(name = "country_code2", unique = true, nullable = false)
    private String countryCode2;

    @Column(name = "country_code3", unique = true, nullable = false)
    private String countryCode3;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "region_id", referencedColumnName = "region_id", nullable = false)
    private Region countryRegion;

    @OneToMany(mappedBy = "country")
    private Set<CountryLanguage> countryLanguages = new HashSet<>();


    @OneToMany(mappedBy = "country")
    private Set<CountryStats> countryStats = new HashSet<>();

    public Country() {
    }

    public Country(int countryId, String countryName, BigDecimal countryArea, Date countryNationalDay, String countryCode2, String countryCode3, Region countryRegion, Set<CountryLanguage> countryLanguages, Set<CountryStats> countryStats) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.countryArea = countryArea;
        this.countryNationalDay = countryNationalDay;
        this.countryCode2 = countryCode2;
        this.countryCode3 = countryCode3;
        this.countryRegion = countryRegion;
        this.countryLanguages = countryLanguages;
        this.countryStats = countryStats;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public BigDecimal getCountryArea() {
        return countryArea;
    }

    public void setCountryArea(BigDecimal countryArea) {
        this.countryArea = countryArea;
    }

    public Date getCountryNationalDay() {
        return countryNationalDay;
    }

    public void setCountryNationalDay(Date countryNationalDay) {
        this.countryNationalDay = countryNationalDay;
    }

    public String getCountryCode2() {
        return countryCode2;
    }

    public void setCountryCode2(String countryCode2) {
        this.countryCode2 = countryCode2;
    }

    public String getCountryCode3() {
        return countryCode3;
    }

    public void setCountryCode3(String countryCode3) {
        this.countryCode3 = countryCode3;
    }

    public Region getCountryRegion() {
        return countryRegion;
    }

    public void setCountryRegion(Region countryRegion) {
        this.countryRegion = countryRegion;
    }

    public Set<CountryLanguage> getCountryLanguages() {
        return countryLanguages;
    }

    public void setCountryLanguages(Set<CountryLanguage> countryLanguages) {
        this.countryLanguages = countryLanguages;
    }

    public Set<CountryStats> getCountryStats() {
        return countryStats;
    }

    public void setCountryStats(Set<CountryStats> countryStats) {
        this.countryStats = countryStats;
    }
}
