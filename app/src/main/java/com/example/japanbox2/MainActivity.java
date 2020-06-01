package com.example.japanbox2;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecycleView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutmanager;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

        ArrayList<PrimjerItem> primjerLista = new ArrayList<>();
        primjerLista.add(new PrimjerItem(R.drawable.ic_android, "Nigiri Sushi", "time to prepare: 30 minutes "));
        primjerLista.add(new PrimjerItem(R.drawable.ic_restaurant, "Mochi dessert", "time to prepare: 20 minutes "));
        primjerLista.add(new PrimjerItem(R.drawable.ic_room_service, "Ramen Noodles", "time to prepare: 30 minutes "));
        primjerLista.add(new PrimjerItem(R.drawable.ic_restaurant, "Spicy Salmon Poke Bowl", "time to prepare: 50 minutes"));

        mRecycleView = findViewById(R.id.recyclerView);
        mRecycleView.setHasFixedSize(true);
        mLayoutmanager = new LinearLayoutManager(this);
        mAdapter = new Recipes(primjerLista);

        mRecycleView.setLayoutManager(mLayoutmanager);
        mRecycleView.setAdapter(mAdapter);

    }

}
