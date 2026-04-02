package com.example.recipeapi;

import com.example.recipeapi.model.Recipe;
import com.example.recipeapi.repository.RecipeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RecipeApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecipeApiApplication.class, args);
    }


}