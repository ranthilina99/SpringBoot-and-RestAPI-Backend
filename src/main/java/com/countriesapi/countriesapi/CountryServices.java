package com.countriesapi.countriesapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServices {

    @Autowired
    private CountryRepository repository; //declare the repository object

    //create the getCountry function
    public List<Country> getCountry(){
        return repository.findAll();
    }

    //create the addCountry function
    public void addCountry(Country country){
        repository.save(country);
    }
    //create the updateCountry function
    public void updateCountry(Country country){
        repository.save(country);
    }
    //create the deleteCountry function
    public void deleteCountry(Integer id){
        repository.deleteById(id);
    }
}
