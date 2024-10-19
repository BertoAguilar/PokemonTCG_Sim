package com.alberto.pokemontcg.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pokemon {
    @Id // Specify the primary key if you plan to use it as such
    private Long id; // You may want to add an id or unique identifier
    private String name;
    private String url;

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
