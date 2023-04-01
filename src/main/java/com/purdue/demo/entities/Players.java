package com.purdue.demo.entities;

import jakarta.persistence.*;

// the player entity represents a player object in the database
@Entity
@Table(name = "players")
public class Players {

    // attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String sport;

    // getters and setters
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
}
