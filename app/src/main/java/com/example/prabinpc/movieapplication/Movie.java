package com.example.prabinpc.movieapplication;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Movie {
    @SerializedName("poster_path")
    private String posterPath;
    @SerializedName("overview")
    private String overview;
    @SerializedName("genre_ids")
    private List<Integer> id;
    @SerializedName("title")
    private String title;
    @SerializedName("vote_count")
    private Integer voteCount;
    @SerializedName("vote_average")
    private Double voteAverage;

    public Movie(String posterPath,  String overview, List<Integer> id, String title, Integer voteCount,
                 Double voteAverage) {
        this.posterPath = posterPath;
        this.overview = overview;
        this.id.addAll(id);
        this.title = title;
        this.voteCount = voteCount;
        this.voteAverage = voteAverage;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }


    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public List<Integer> getId() {
        return id;
    }

    public void setId(List<Integer> id) {
        this.id.addAll(id);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }
}