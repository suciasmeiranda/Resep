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
        recipes.add(new Recipe("Nasi Goreng", "Nasi, Telur, Kecap, Bawang", "1. Tumis bawang\n2. Masukkan telur\n3. Masukkan nasi dan kecap", R.drawable.nasi_goreng));
        recipes.add(new Recipe("Soto Ayam", "Ayam, Soun, Tauge, Kuah Kuning", "1. Rebus ayam\n2. Siapkan bumbu soto\n3. Sajikan dengan pelengkap", R.drawable.soto_ayam));
        recipes.add(new Recipe("Nasi Kuning", "Beras, Santan, Kunyit", "1. Cuci beras\n2. Masak dengan santan dan kunyit\n3. Sajikan dengan lauk pauk", R.drawable.nasi_kuning));
        recipes.add(new Recipe("Sop Daging", "Daging Sapi, Wortel, Kentang", "1. Rebus daging hingga empuk\n2. Masukkan sayuran\n3. Bumbui dan sajikan", R.drawable.sop_daging));

        RecipeAdapter adapter = new RecipeAdapter(recipes, recipe -> {
            Intent intent = new Intent(getActivity(), DetailActivity.class);
            intent.putExtra("recipe", recipe);
            startActivity(intent);
        });

        recyclerView.setAdapter(adapter);

        return view;
    }
}
