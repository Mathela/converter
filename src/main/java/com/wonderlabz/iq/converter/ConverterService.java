/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wonderlabz.iq.converter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nkosinathi Mathela
 */
@RestController
@RequestMapping("/conversions")
public class ConverterService {
    
    @GetMapping(path = "/ktoc/{temperature}", produces = "application/xml")
    public Double convertKelvinToCelsius(@PathVariable Double temperature
    ){
        Double newTemp=0.00;
        newTemp = newTemp -273.15;
        return newTemp;
    } 
    
    @GetMapping(path = "/ctok/{temperature}", produces = "application/xml")
    public Double convertCelsiusToKelvin(@PathVariable Double temperature
    ){
        Double newTemp=0.00;
        newTemp = newTemp +273.15;
        return newTemp;
    } 
    
       @GetMapping(path = "/mtok/{distance}", produces = "application/xml")
    public Double mileToKm(@PathVariable Double distance
    ){
        Double newDistance=0.00;
        newDistance = newDistance * 1.60934 ;
        return newDistance;
    } 
    
     @GetMapping(path = "/mtok/{distance}", produces = "application/xml")
    public Double kmToMiles(@PathVariable Double distance
    ){
        Double newDistance=0.00;
        newDistance = newDistance / 1.60934 ;
        return newDistance;
    } 
}
