package com.countriesapi.countriesapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Check the REST EndPoint
@RestController
@CrossOrigin(origins="http://localhost:4200")// link the angular
public class Controller {

    @Autowired
    private CountryServices services; //declare the service object

    //create get mapping the rest api of all countries
    @GetMapping("/rest/v2/countries")
    public List<Country> getCountry(){
        return services.getCountry();
    }

    //create post mapping the rest api in the add database
    @PostMapping("rest/v2/country/addnew")
    public void addCountry(@RequestBody Country country){
        services.addCountry(country);

    }

    //create put mapping the rest api of country is updated
    @PutMapping("rest/v2/countries/{id}/edit")
    public void updateCountry(@PathVariable("id") Integer id, @RequestBody Country country){
        services.updateCountry(country);
    }

    //create delete mapping the rest api of delete country
    @DeleteMapping("rest/v2/countries/{id}/delete")
    public void deleteCountry(@PathVariable("id") Integer id){
        services.deleteCountry(id);
    }

}
