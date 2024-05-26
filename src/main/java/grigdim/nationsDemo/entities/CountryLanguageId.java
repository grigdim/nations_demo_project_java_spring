package grigdim.nationsDemo.entities;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CountryLanguageId implements Serializable {

    private int countryId;
    private int languageId;

    public CountryLanguageId() {
    }

    public CountryLanguageId(int countryId, int languageId) {
        this.countryId = countryId;
        this.languageId = languageId;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }
}
