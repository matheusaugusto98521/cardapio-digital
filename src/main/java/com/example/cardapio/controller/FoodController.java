package com.example.cardapio.controller;

import com.example.cardapio.food.Food;
import com.example.cardapio.food.FoodRepository;
import com.example.cardapio.food.FoodRequestDTO;
import com.example.cardapio.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FoodController {
    @Autowired
    private FoodRepository repository;

    @GetMapping("/")
    public ResponseEntity<List<FoodResponseDTO>> getAll(){
        List<FoodResponseDTO> foods = repository.findAll().stream().map(FoodResponseDTO::new).toList();

        return ResponseEntity.ok().body(foods);
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveFood(@RequestBody FoodRequestDTO data){
        var food = new Food(data);
        this.repository.save(food);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
