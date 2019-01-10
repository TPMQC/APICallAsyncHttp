package com.example.logan.demoapicall;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.logan.demoapicall.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieActivity extends AppCompatActivity {
    private MoviesAdapter moviesAdapter;
    private List<Movie> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        initLayouts();

        initRecylerView();

        //fake data
        movies.add(new Movie(1, "poster path", "superman", "super overview", 3.0));
        movies.add(new Movie(2, "poster path", "superman", "superman", 3.0));
    }

    private void initRecylerView() {
        RecyclerView recyclerView = findViewById(R.id.rvMovies);
        moviesAdapter = new MoviesAdapter(this, movies);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(moviesAdapter); //pair recyclerView and an adapter together
    }

    private void initLayouts() {
        movies = new ArrayList<>();
    }
}

