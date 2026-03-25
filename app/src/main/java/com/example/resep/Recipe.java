package com.example.resep;

import java.io.Serializable;

public class Recipe implements Serializable {
    private String name;
    private String ingredients;
    private String instructions;
    private int imageResId;
    private String time;

    public Recipe(String name, String ingredients, String instructions, int imageResId, String time) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.imageResId = imageResId;
        this.time = time;
    }

    public String getName() { return name; }
    public String getIngredients() { return ingredients; }
    public String getInstructions() { return instructions; }
    public int getImageResId() { return imageResId; }
    public String getTime() { return time; }
}
