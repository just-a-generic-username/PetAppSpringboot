package com.prashant.details.models;

public class BreedDetails {

    private int id;
    private String name;
    private String origin;
    private String colour;
    private String life_span;
    private String weight;

    public BreedDetails() {
    }

    public BreedDetails(int id, String name, String origin, String colour, String life_span, String weight) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.colour = colour;
        this.life_span = life_span;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getLife_span() {
        return life_span;
    }

    public void setLife_span(String life_span) {
        this.life_span = life_span;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

}
