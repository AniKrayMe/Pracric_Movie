package com.company;

import java.rmi.server.UID;

public class Movie {
    //region Properties
    private String name;
    private int UID;
    private String genre;
    private int duration;
    //endregion
    //region Constructor

    public Movie(String name, int UID, String genre, int duration) {
        this.name = name;
        this.UID = UID;
        this.genre = genre;
        this.duration = duration;
    }

    public Movie() {
    }
    //endregion
    //region Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    //endregion
    //region equals hashCode and toString

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", UID=" + UID +
                ", genre='" + genre + '\'' +
                ", duration=" + duration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        if (UID != movie.UID) return false;
        if (duration != movie.duration) return false;
        if (name != null ? !name.equals( movie.name ) : movie.name != null) return false;
        return genre != null ? genre.equals( movie.genre ) : movie.genre == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + UID;
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + duration;
        return result;
    }
    //endregion
}
