package com.alberto.pokemontcg.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.alberto.pokemontcg.Models.Pokemon;
import com.alberto.pokemontcg.Services.PokemonService;
import com.alberto.pokemontcg.Services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class PokemonController {
	@Autowired
	PokemonService pokemons;
	
    @Autowired
    UserService users;
	
    // Show all teams
    @GetMapping("/homepage")
    public String homepage(HttpSession session, Model model) {
        Long userId = (Long) session.getAttribute("userId");
        if (userId == null) {
            return "redirect:/";
        }
        model.addAttribute("user", users.getLoggedInUser(userId));
        List<Pokemon> pokemon = pokemons.allPokemons();
        model.addAttribute("pokemon", pokemon);
        return "homepage.jsp";
    }

}
