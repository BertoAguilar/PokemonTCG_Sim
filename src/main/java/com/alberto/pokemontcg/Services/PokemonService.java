package com.alberto.pokemontcg.Services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.alberto.pokemontcg.Models.Pokemon;
import com.alberto.pokemontcg.Models.PokemonApiResponse;

@Service
public class PokemonService {
    
    private static final String API_URL = "https://pokeapi.co/api/v2/pokemon?limit=9";

    public List<Pokemon> allPokemons() {
        RestTemplate restTemplate = new RestTemplate();
        PokemonApiResponse response = restTemplate.getForObject(API_URL, PokemonApiResponse.class);
        return response.getResults();
    }
}
