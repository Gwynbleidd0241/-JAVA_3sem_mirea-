package com.example.Pr16.model;

import java.util.List;

public class SearchResult {
    private String title;
    private List<String> director;
    private String releaseYear;

    public SearchResult(String title, List<String> director, String releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getDirector() {
        return director;
    }

    public String getReleaseYear() {
        return releaseYear;
    }
}

