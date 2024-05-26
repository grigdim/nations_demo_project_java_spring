package grigdim.nationsDemo.controllers;

import grigdim.nationsDemo.entities.Continent;
import grigdim.nationsDemo.services.ContinentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/continents")
public class ContinentController {

    @Autowired
    private ContinentService continentService;


    @GetMapping
    public ResponseEntity<List<Continent>> getAllContinents() {
        List<Continent> continents = continentService.getAllContinents();
        return new ResponseEntity<>(continents, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Continent> getContinentById(@PathVariable("id") int id) {
        Continent continent = continentService.getContinentById(id);
        if (continent == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(continent, HttpStatus.OK);
    }
}
