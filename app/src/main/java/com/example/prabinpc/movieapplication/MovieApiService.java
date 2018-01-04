package com.example.prabinpc.movieapplication;

import android.support.v7.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface MovieApiService{
    @GET("movie/top_rated")
    Call<MovieResponse> getTopRatedMovies(@Query("api_key")String apikey);
    @GET("movie/popular")
    Call<MovieResponse> getPopularMovies(@Query("api_key") String apikey);

}
