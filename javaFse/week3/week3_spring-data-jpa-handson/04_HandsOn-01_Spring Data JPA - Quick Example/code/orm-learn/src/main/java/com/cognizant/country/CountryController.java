package com.cognizant.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryRepository repo;

    @PostMapping
    public Country save(@RequestBody Country country) {
        return repo.save(country);
    }

    @GetMapping
    public List<Country> getAll() {
        return repo.findAll();
    }
}
