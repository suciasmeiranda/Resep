package com.example.resep;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.detailImage);
        TextView nameTextView = findViewById(R.id.detailName);
        TextView ingredientsTextView = findViewById(R.id.detailIngredients);
        TextView instructionsTextView = findViewById(R.id.detailInstructions);

        Recipe recipe = (Recipe) getIntent().getSerializableExtra("recipe");

        if (recipe != null) {
            imageView.setImageResource(recipe.getImageResId());
            nameTextView.setText(recipe.getName());
            ingredientsTextView.setText(recipe.getIngredients());
            instructionsTextView.setText(recipe.getInstructions());
            setTitle(recipe.getName());
        }
    }
}
