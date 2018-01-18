package com.example.prabinpc.movieapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;
import android.widget.Toast;


public class ProjectDetailsActivity extends Activity {
    TextView mMovieDescription;
    Movie movies;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_details);
        mMovieDescription = findViewById(R.id.project_details_movie_description);
        movies =(Movie) getIntent().getExtras().getSerializable("movies");
        mMovieDescription.setText(movies.getTitle());
        Toast.makeText(this,"We are in Movie Details Page",Toast.LENGTH_LONG).show();
    }
}
