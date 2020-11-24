package com.bharucha.springbrewery.services;

import com.bharucha.springbrewery.web.model.BeerDto;

import java.util.UUID;

// most logic is inside the Service
public interface BeerService {

    BeerDto getBeerById(UUID beerId);
}
