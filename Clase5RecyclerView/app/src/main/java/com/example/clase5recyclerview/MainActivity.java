package com.example.clase5recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Jhon Wick", "jhon.wick@email.com", R.drawable.a));
        items.add(new Item("Robert J", "robert.jk@email.com", R.drawable.b));
        items.add(new Item("James Gunn", "james.gunn@email.com", R.drawable.c));
        items.add(new Item("Ricky Tales", "ricky.tales@email.com", R.drawable.d));
        items.add(new Item("Micky Mose", "micky.mose@email.com", R.drawable.e));
        items.add(new Item("Pick War", "pick.war@email.com", R.drawable.f));
        items.add(new Item("Leg Piece", "leg.piece@email.com", R.drawable.g));
        items.add(new Item("Apple Mac", "apple.mac@email.com", R.drawable.h));

        items.add(new Item("Jhon Wick", "jhon.wick@email.com", R.drawable.a));
        items.add(new Item("Robert J", "robert.jk@email.com", R.drawable.b));
        items.add(new Item("James Gunn", "james.gunn@email.com", R.drawable.c));
        items.add(new Item("Ricky Tales", "ricky.tales@email.com", R.drawable.d));
        items.add(new Item("Micky Mose", "micky.mose@email.com", R.drawable.e));
        items.add(new Item("Pick War", "pick.war@email.com", R.drawable.f));
        items.add(new Item("Leg Piece", "leg.piece@email.com", R.drawable.g));
        items.add(new Item("Apple Mac", "apple.mac@email.com", R.drawable.h));

        items.add(new Item("Jhon Wick", "jhon.wick@email.com", R.drawable.a));
        items.add(new Item("Robert J", "robert.jk@email.com", R.drawable.b));
        items.add(new Item("James Gunn", "james.gunn@email.com", R.drawable.c));
        items.add(new Item("Ricky Tales", "ricky.tales@email.com", R.drawable.d));
        items.add(new Item("Micky Mose", "micky.mose@email.com", R.drawable.e));
        items.add(new Item("Pick War", "pick.war@email.com", R.drawable.f));
        items.add(new Item("Leg Piece", "leg.piece@email.com", R.drawable.g));
        items.add(new Item("Apple Mac", "apple.mac@email.com", R.drawable.h));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));
    }
}