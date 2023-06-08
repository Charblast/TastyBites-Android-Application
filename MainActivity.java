package com.example.recipe_project;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        List<Recipe> recipeList = new ArrayList<>();
        recipeList.add(new Recipe("Pasta","Pasta is a type of noodle made from a dough of durum wheat flour mixed with water or eggs. It is a staple food in Italian cuisine and has become popular all over the world due to its versatility and ease of preparation. Pasta can be served with a variety of sauces, such as tomato sauce, pesto, or alfredo sauce, and can also be used in salads or baked dishes. Some common types of pasta include spaghetti, fettuccine, penne, and macaroni. Pasta is a good source of carbohydrates and can be a part of a healthy, balanced diet when consumed in moderation.", "1 pound pasta\n1 onion, chopped\n3 cloves garlic, minced\n1/4 cup olive oil\n1 (28 ounce) can crushed tomatoes\n1 teaspoon salt\n1/2 teaspoon black pepper\n1/4 teaspoon red pepper flakes\n1/4 teaspoon dried oregano\n1/4 teaspoon dried basil\n1/4 teaspoon dried thyme\n1/4 cup grated Parmesan cheese",
                "Method","1. Cook pasta according to package directions.\n2. Meanwhile, heat olive oil in a large saucepan over medium heat. Add onion and garlic and cook until onion is soft and translucent, about 5 minutes.\n3. Add crushed tomatoes, salt, black pepper, red pepper flakes, oregano, basil, and thyme. Simmer for 15 minutes.\n4. Toss pasta with sauce and top with Parmesan cheese.",R.drawable.pasta));

        recipeList.add(new Recipe("Donut","Donut, also spelled doughnut, is a type of fried or baked pastry that is typically shaped like a torus, with a hole in the center. It is a popular snack and dessert food in many countries around the world. Donuts can be made in a variety of flavors, including chocolate, vanilla, and strawberry, and can be topped with a variety of sweet toppings, such as icing, sprinkles, or powdered sugar. Some popular variations include jelly-filled donuts, glazed donuts, and Boston cream donuts.", "500 gms flour\n100 gms sugar\n2 Egg yolk\n1/2 Egg\n100 gms butter\n25 gms yeast\n250 gms milkChocolate (to dip the doughnut), melted",
                "Method","1.Mix all together to make a dough and rest for 10 minutes.\n2.Roll the dough at the thickness of 2 inch then cut with round cutter.\n3.Allow the doughnut to prove till double the size.\n4.Deep fry the doughnut till it turns golden brown.\n5.Allow the doughnut to get cool and then dip in chocolate.",R.drawable.donut));

        recipeList.add(new Recipe("Dosa","Dosa is a popular South Indian dish that is enjoyed throughout the Indian subcontinent and beyond. It is a type of pancake made from a fermented batter of rice and urad dal (a type of lentil). The batter is spread thinly on a hot griddle or tawa and cooked until crisp and golden-brown on both sides.\n" +
                "\n" +
                "Dosa is typically served with a variety of accompaniments, such as sambar (a spicy vegetable soup), coconut chutney, and tomato chutney. It can be eaten for breakfast, lunch, or dinner, and is a filling and nutritious meal. Dosa is also versatile, and can be made with a variety of fillings, such as potatoes, onions, and cheese.\n" +
                "\n" +
                "In addition to being delicious and satisfying, dosa is also a healthy choice, as it is low in fat and calories, and contains a good balance of protein and carbohydrates. It is also gluten-free and vegan, making it suitable for a wide range of dietary requirements. Overall, dosa is a popular and beloved dish that is sure to delight anyone who tries it.", "1 cup of rice\n" +
                "1/2 cup of urad dal\n" +
                "1/2 teaspoon of fenugreek seeds\n" +
                "Water as needed\n" +
                "Salt to taste\n" +
                "Oil or ghee for cooking",
                "Method","Sure, here's a basic recipe for dosa:\n" +
                "\n" +
                "Ingredients:\n" +
                "\n" +
                "1 cup of rice\n" +
                "1/2 cup of urad dal\n" +
                "1/2 teaspoon of fenugreek seeds\n" +
                "Water as needed\n" +
                "Salt to taste\n" +
                "Oil or ghee for cooking\n" +
                "Instructions:\n" +
                "\n" +
                "1. Rinse the rice and urad dal separately and soak them in water for at least 4 hours.\n" +
                "2. After soaking, drain the water from both the rice and dal. Rinse them again and drain the water.\n" +
                "3. In a blender or food processor, grind the rice into a smooth batter. Add water as needed to make a thick but pourable batter. Pour the batter into a large mixing bowl.\n" +
                "4. In the same blender or food processor, grind the urad dal and fenugreek seeds together into a smooth batter. Add water as needed to make a thick and fluffy batter. Pour the batter into the mixing bowl with the rice batter.\n" +
                "5. Mix the two batters together until well combined. Cover the bowl and let the batter ferment in a warm place for at least 8 hours, or overnight. The batter should double in volume and have a slightly sour smell.\n" +
                "6. Once the batter has fermented, add salt to taste and mix well.\n" +
                "7. Heat a non-stick or cast-iron pan over medium heat. Once the pan is hot, ladle about 1/4 to 1/2 cup of batter onto the center of the pan. Using the back of the ladle, spread the batter out into a thin, even circle.\n" +
                "8. Drizzle a little bit of oil or ghee around the edges of the dosa. Let the dosa cook for 2-3 minutes or until the edges start to lift up and the bottom is golden brown.\n" +
                "9. Use a spatula to loosen the edges of the dosa, then carefully flip it over. Let the other side cook for another 1-2 minutes or until golden brown.\n" +
                "10. Serve the dosa hot with coconut chutney, sambar, or any other accompaniments of your choice. Repeat with the remaining batter to make more dosas.",R.drawable.dosa));

        recipeList.add(new Recipe("Pancake","Pancakes are a popular breakfast dish that are typically made from a simple batter of flour, eggs, milk, and baking powder. They are cooked on a griddle or frying pan and served hot, often topped with butter and syrup. Pancakes can be made in a variety of flavors, such as blueberry or chocolate chip, and can be served with a variety of toppings, such as whipped cream or fresh fruit. They are a classic comfort food that can be enjoyed any time of the day.", "1 1/2 cups all-purpose flour\n" +
                "3 1/2 teaspoons baking powder\n" +
                "1 teaspoon salt\n" +
                "1 tablespoon white sugar\n" +
                "1 1/4 cups milk\n" +
                "1 egg\n" +
                "3 tablespoons butter, melted",
                "Method","1. In a large mixing bowl, sift together the flour, baking powder, salt, and sugar.\n" +
                "2. In a separate mixing bowl, beat together the milk and egg until smooth.\n" +
                "3. Stir the melted butter into the milk and egg mixture.\n" +
                "4. Pour the wet ingredients into the dry ingredients and whisk together until the batter is smooth.\n" +
                "5. Heat a lightly oiled griddle or frying pan over medium-high heat.\n" +
                "6. Scoop 1/4 cup of batter onto the griddle or pan for each pancake.\n" +
                "7. Cook until the pancake is golden brown on both sides.\n" +
                "8. Serve hot with your favorite toppings, such as butter and syrup, fruit, or whipped cream. Enjoy!\n"
                ,R.drawable.pancake));

        recipeList.add(new Recipe("Chicken roll","Chicken roll is a popular street food that originated in India and has since become popular all over the world. It typically consists of a thin flatbread, such as a tortilla or roti, wrapped around cooked and seasoned chicken pieces, along with a variety of fillings like lettuce, onions, tomatoes, and sauces like mayonnaise or ketchup. Chicken rolls are often served as a quick snack or a meal on-the-go and are loved for their delicious taste and convenience. They can be customized with various ingredients to suit different tastes and preferences, making them a versatile and satisfying option for any meal.",
                "2 boneless, skinless chicken breasts, cooked and shredded\n" +
                        "1/4 cup mayonnaise\n" +
                        "1 tablespoon Dijon mustard\n" +
                        "1 teaspoon garlic powder\n" +
                        "1/2 teaspoon paprika\n" +
                        "1/4 teaspoon cayenne pepper\n" +
                        "Salt and pepper, to taste\n" +
                        "4 large flour tortillas\n" +
                        "4 leaves lettuce\n" +
                        "1 large tomato, sliced\n" +
                        "1/2 cup shredded cheddar cheese",
                "Method","1. In a large bowl, mix together the shredded chicken, mayonnaise, Dijon mustard, garlic powder, paprika, cayenne pepper, salt, and pepper until well combined.\n" +
                "2. Lay out the flour tortillas and place a lettuce leaf on each one.\n" +
                "3. Spoon the chicken mixture onto each tortilla, spreading it out evenly.\n" +
                "4. Place the sliced tomato on top of the chicken mixture, and sprinkle with shredded cheddar cheese.\n" +
                "5. Roll up each tortilla tightly, tucking in the ends as you go.\n" +
                "6. Slice the chicken roll-ups into bite-sized pieces and serve.",R.drawable.chicken_roll));

        mAdapter = new RecyclerViewAdapter(this, recipeList);
        mRecyclerView.setAdapter(mAdapter);
    }
}
