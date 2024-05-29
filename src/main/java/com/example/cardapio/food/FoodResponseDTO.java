package com.example.cardapio.food;

import java.math.BigDecimal;
import java.util.UUID;

public record FoodResponseDTO(UUID id, String title, String image, BigDecimal price) {
    public FoodResponseDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
