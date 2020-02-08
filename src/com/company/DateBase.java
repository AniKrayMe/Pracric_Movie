package com.company;

import java.util.HashMap;

public class DateBase {
     private HashMap<Integer,Movie> movies;


    public DateBase(HashMap<Integer, Movie> movies) {
        this.movies = new HashMap<>(  );
    }

    public DateBase() {
    }

    public HashMap<Integer, Movie> getMovies() {
        return movies;
    }

    public void setMovies(HashMap<Integer, Movie> movies) {
        this.movies = new HashMap<>(  );
    }

    public void addMovies(Movie movie){
        movies.put(movie.getUID(),movie);
    }

}



