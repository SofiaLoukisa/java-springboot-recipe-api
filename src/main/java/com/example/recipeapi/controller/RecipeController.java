package com.example.recipeapi.controller;

import com.example.recipeapi.model.Recipe;
import com.example.recipeapi.repository.RecipeRepository;
import org.springframework.web.bind.annotation.*;
import com.example.recipeapi.service.SpoonacularService;

import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    private final RecipeRepository recipeRepository;
    private final SpoonacularService spoonacularService;

    public RecipeController(RecipeRepository recipeRepository,
                            SpoonacularService spoonacularService) {
        this.recipeRepository = recipeRepository;
        this.spoonacularService = spoonacularService;
    }

    @GetMapping
    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    @PostMapping
    public Recipe createRecipe(@RequestBody Recipe recipe) {
        return recipeRepository.save(recipe);
    }
    @GetMapping("/external")
    public String getFromSpoonacular() {
        return spoonacularService.getRecipesFromApi();
    }
}