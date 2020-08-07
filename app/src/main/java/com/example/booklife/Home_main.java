package com.example.booklife;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Home_main extends AppCompatActivity {
    RecyclerView recyclerView;

    String s1[],s2[];
    int img[] = {R.drawable.hp_chamber_of_secrete,R.drawable.hp_globet_of_fire,R.drawable.hp_phillosopia_stom,
            R.drawable.hp_curse_child,R.drawable.hobbit,R.drawable.petter_rabbit,R.drawable.little_women,R.drawable.hobbit,R.drawable.vampire,};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.book_name);
        s2 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this,s1,s2,img);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
