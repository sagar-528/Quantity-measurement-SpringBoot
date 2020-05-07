package com.bridgelabz.Controller;

import com.bridgelabz.DTO.MeasurementUnit;
import com.bridgelabz.DTO.QuantityUnits;
import com.bridgelabz.DTO.Unit;
import com.bridgelabz.Serivces.QuantityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuantityController {

    @Autowired
    QuantityServices quantityServices;

    @GetMapping("/quantity")
    public ResponseEntity getQuantityList(){
        return new ResponseEntity(quantityServices.getQuantity(), HttpStatus.OK);
    }

    @GetMapping("/quantity/{quantityName}")
    public ResponseEntity getUnitList(@PathVariable MeasurementUnit quantityName){
        return new ResponseEntity(quantityServices.getMeasurementUnit(quantityName), HttpStatus.OK);
    }

    @PostMapping("/quantity/conversion/{userUnit}")
    public ResponseEntity convertQuantityUnit(@RequestBody QuantityUnits quantityunits, @PathVariable Unit userUnit){
        return new ResponseEntity(quantityServices.results(quantityunits, userUnit), HttpStatus.OK);
    }
}
