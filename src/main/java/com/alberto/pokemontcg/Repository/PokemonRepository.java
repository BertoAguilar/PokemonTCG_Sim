package com.alberto.pokemontcg.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alberto.pokemontcg.Models.Pokemon;







@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
    // Custom query methods (if any) can be defined here
}