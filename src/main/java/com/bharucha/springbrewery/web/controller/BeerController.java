package com.bharucha.springbrewery.web.controller;

import com.bharucha.springbrewery.services.BeerService;
import com.bharucha.springbrewery.web.model.BeerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping(value = "/api/v1/beer") // base URL for the entire class
@RestController // adds ResponseBody and all that.
public class BeerController {
    // MVC Controller [ step 2, step 1 is BeerDto ]

    // Service layer [ step 3 ]
    private final BeerService beerService;

    // don't have to Autowire it, Spring does it for you automatically but still.
    @Autowired
    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    // ResponseEntity just gives a little bit more control, otherwise spring does Serialize BeerDto
    @GetMapping(value = "/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId) {

        // for now just returning a new BeerDto object
        // ResponseEntity so we can send back a Status
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }


}
