package com.sila.dto.request;

import lombok.Data;

@Data
public class IngredientReq {
    private String name;
    private Long restaurantId;
    private Long categoryId;
}
