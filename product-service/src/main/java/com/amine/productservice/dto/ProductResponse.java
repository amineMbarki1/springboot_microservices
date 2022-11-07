package com.amine.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//Good practice to seperate Model entities and dtos ;) data transfer objects
//Ideally u shouldn't expose model entities to outside world
//cause in the future u might add fields necessary for business logic in models but not necessary for user to receive
public class ProductResponse {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
