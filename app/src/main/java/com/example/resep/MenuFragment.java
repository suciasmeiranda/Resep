package com.example.resep;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MenuFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<Recipe> recipes = new ArrayList<>();
        recipes.add(new Recipe("Nasi Goreng", "Nasi, Telur, Kecap, Bawang", "1. Tumis bawang\n2. Masukkan telur\n3. Masukkan nasi dan kecap", R.drawable.nasi_goreng, "15 menit"));
        recipes.add(new Recipe("Mie Goreng", "Mie, Sayur, Bakso, Kecap", "1. Rebus mie\n2. Tumis bumbu dan bakso\n3. Masukkan mie dan aduk rata", R.drawable.nasi_goreng, "10 menit"));
        recipes.add(new Recipe("Ayam Goreng", "Ayam, Lengkuas, Kunyit, Bawang", "1. Ungkep ayam dengan bumbu\n2. Goreng hingga kecokelatan", R.drawable.soto_ayam, "30 menit"));
        recipes.add(new Recipe("Soto Ayam", "Ayam, Soun, Tauge, Kuah Kuning", "1. Rebus ayam\n2. Siapkan bumbu soto\n3. Sajikan dengan pelengkap", R.drawable.soto_ayam, "45 menit"));
        recipes.add(new Recipe("Pisang Goreng", "Pisang, Tepung, Gula", "1. Campur adonan tepung\n2. Masukkan pisang\n3. Goreng hingga matang", R.drawable.nasi_kuning, "10 menit"));

        RecipeAdapter adapter = new RecipeAdapter(recipes, recipe -> {
            Intent intent = new Intent(getActivity(), DetailActivity.class);
            intent.putExtra("recipe", recipe);
            startActivity(intent);
        });

        recyclerView.setAdapter(adapter);

        return view;
    }
}
