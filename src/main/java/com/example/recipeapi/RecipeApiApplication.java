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

    @Bean
    public org.springframework.boot.CommandLineRunner demo(RecipeRepository recipeRepository) {
        return args -> {
            Recipe recipe = new Recipe(
                    "Pasta Carbonara",
                    "Classic Italian pasta with eggs and cheese",
                    "https://example.com/carbonara.jpg"
            );

            recipeRepository.save(recipe);
        };
    }
}