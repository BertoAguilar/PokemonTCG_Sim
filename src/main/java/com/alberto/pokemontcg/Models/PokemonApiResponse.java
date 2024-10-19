package com.alberto.pokemontcg.Models;

import java.util.List;

public class PokemonApiResponse {
    private List<Pokemon> results;

    public List<Pokemon> getResults() {
        return results;
    }

    public void setResults(List<Pokemon> results) {
        this.results = results;
    }
}
