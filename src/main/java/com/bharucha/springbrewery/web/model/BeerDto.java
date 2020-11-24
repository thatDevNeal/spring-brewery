package com.bharucha.springbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data // getters setters equals hashcode
@NoArgsConstructor // no argument constructor
@AllArgsConstructor // constructor with all arguments
@Builder // Implements the Builder Pattern
public class BeerDto {
    // Data Model [ step 1 ]

    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;

}
