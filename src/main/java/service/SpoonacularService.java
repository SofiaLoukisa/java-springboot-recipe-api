package com.example.recipeapi.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SpoonacularService {

    @Value("${spoonacular.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    public String getRecipesFromApi() {
        String url = "https://api.spoonacular.com/recipes/random?number=1&apiKey=" + apiKey;

        return restTemplate.getForObject(url, String.class);
    }
}