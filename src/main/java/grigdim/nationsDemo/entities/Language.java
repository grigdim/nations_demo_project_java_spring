package grigdim.nationsDemo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "languages")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id", unique = true, nullable = false)
    private int languageId;

    @Column(name = "language", unique = true, nullable = false)
    private String languageName;

    @JsonIgnore
    @OneToMany(mappedBy = "language")
    private Set<CountryLanguage> countries = new HashSet<>();

    public Language() {
    }

    public Language(int languageId, String languageName, Set<CountryLanguage> countries) {
        this.languageId = languageId;
        this.languageName = languageName;
        this.countries = countries;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public Set<CountryLanguage> getCountries() {
        return countries;
    }

    public void setCountries(Set<CountryLanguage> countries) {
        this.countries = countries;
    }
}
