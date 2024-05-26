package grigdim.nationsDemo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "country_languages")
public class CountryLanguage {

    @EmbeddedId
    private CountryLanguageId id;

    @Column(name = "official", nullable = false)
    private boolean official;

    @JsonIgnore
    @ManyToOne
    @MapsId("countryId")
    @JoinColumn(name = "country_id", referencedColumnName = "country_id", nullable = false, insertable = false, updatable = false)
    private Country country;

    @JsonIgnore
    @ManyToOne
    @MapsId("languageId")
    @JoinColumn(name = "language_id", referencedColumnName = "language_id", nullable = false, insertable = false, updatable = false)
    private Language language;

    public CountryLanguageId getId() {
        return id;
    }

    public void setId(CountryLanguageId id) {
        this.id = id;
    }

    public boolean isOfficial() {
        return official;
    }

    public void setOfficial(boolean official) {
        this.official = official;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}

