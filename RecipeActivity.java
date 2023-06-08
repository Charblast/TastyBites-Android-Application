package com.example.recipe_project;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecipeActivity extends AppCompatActivity {
    private ImageView mRecipeImage;
    private TextView mRecipeName;
    private TextView mRecipeDescription;
    private TextView mRecipeIngredientsTitle;
    private TextView mRecipeIngredients;
    private TextView mRecipeMethodTitle;
    private TextView mRecipeMethod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        mRecipeImage = findViewById(R.id.recipe_image);
        mRecipeName = findViewById(R.id.recipe_name);
        mRecipeDescription = findViewById(R.id.recipe_description);
        mRecipeIngredientsTitle = findViewById(R.id.recipe_ingredients_title);
        mRecipeIngredients = findViewById(R.id.recipe_ingredients);
        mRecipeMethodTitle = findViewById(R.id.recipe_method_title);
        mRecipeMethod = findViewById(R.id.recipe_method);

        Intent intent = getIntent();
        String recipeName = intent.getStringExtra("RecipeName");
        String recipeDescription = intent.getStringExtra("RecipeDescription");
        String recipeIngredients = intent.getStringExtra("RecipeIngredients");
        String recipeMethodTitle = intent.getStringExtra("RecipeMethodTitle");
        String recipeMethod = intent.getStringExtra("RecipeMethod");
        int recipeThumbnail = intent.getIntExtra("Thumbnail", 0);

        mRecipeImage.setImageResource(recipeThumbnail);
        mRecipeName.setText(recipeName);
        mRecipeDescription.setText(recipeDescription);
        mRecipeIngredients.setText(recipeIngredients);
        mRecipeMethod.setText(recipeMethod);
        mRecipeMethodTitle.setText(recipeMethodTitle);
    }

}