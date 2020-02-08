package com.company;


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random(  );
        int randomNumber = random.nextInt(900)+100;
        MovieService movieService = new MovieService();
        movieService.create( new Movie( "Matrix",randomNumber,"Action",90  )  );
        movieService.create( new Movie( "Avatar",randomNumber,"Adventure",120 )  );
        Movie movie1 = new Movie("Titanic",randomNumber,"Drama",100 );
        movieService.create( movie1 );
        movieService.findAll();
        movieService.findAllByGenre( "Drama" );
        movieService.delete(  );
        movieService.update(  );
    }
}
