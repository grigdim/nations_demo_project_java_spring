package grigdim.nationsDemo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CountryStatsId implements Serializable {
    @Column(name = "country_id")
    private int countryId;

    @Column(name = "year")
    private int year;

    public CountryStatsId() {
    }

    public CountryStatsId(int countryId, int year) {
        this.countryId = countryId;
        this.year = year;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

