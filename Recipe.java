package com.example.recipe_project;

public class Recipe {

    private String name;
    private String description;
    private String ingredients;
    private String methodTitle;
    private String method;
    private int thumbnail;


    public Recipe(String name,String description, String ingredients, String methodTitle, String method, int thumbnail) {
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
        this.methodTitle = methodTitle;
        this.method = method;
        this.thumbnail = thumbnail;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getMethodTitle() {
        return methodTitle;
    }

    public void setMethodTitle(String methodTitle) {
        this.methodTitle = methodTitle;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
