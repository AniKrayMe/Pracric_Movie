package com.company;

import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovieService extends Movie {
    DateBase dateBase = new DateBase();


    public void create(Movie movie) throws MovieIsNotValidExeption {
        try {
            if (movie.getName() != null && movie.getGenre() != null && movie.getDuration() != 0 && movie.getUID() == 0) {
                Scanner scanner = new Scanner( System.in );
                System.out.println( "Print name of your movie" );
                movie.setName( scanner.nextLine() );
                System.out.println( "print UDI of your movie " );
                movie.setUID( scanner.nextInt() );
                System.out.println( "print genre of your movie" );
                movie.setGenre( scanner.nextLine() );
                System.out.println( "Print duraction of your movie" );
                movie.setDuration( scanner.nextInt() );
                dateBase.addMovies( movie );
            }
        } catch (MovieIsNotValidExeption ex) {
        }
    }

    public Movie findByUID(int UID) {
        return dateBase.getMovies().get( UID );
    }

    public ArrayList<Movie> findAll() {
       return new ArrayList<>( dateBase.getMovies().values() ) ;

    }

    public ArrayList<Movie> findAllByGenre(String genre){
        List<Movie> collect = dateBase.getMovies().values().stream()
                .filter( (each) -> each.getGenre().equals( genre ) )
                .collect( Collectors.toList() );

        return (ArrayList<Movie>) collect;
    }
    public void update(int UID, Movie movie){
        dateBase.getMovies().replace( UID,movie );

    }
    public void delete(int UID){
        dateBase.getMovies().remove(UID );
    }

}


