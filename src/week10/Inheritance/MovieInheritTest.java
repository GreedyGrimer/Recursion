package week10.Inheritance;

import week10.Inheritance.Movie;

public class MovieInheritTest {
    public static void main(String[] args) {
        Movie pokemon = new Movie(9,20,"Ash and pikachu set out on an adventure to save the world");
        Movie ironman = new GenreMovie(12,3,"Tony Stark is the ironman. He's dead.","Action/Comedy");
        Movie fnaf = new RuntimeMovie(13,0,"Spooky Ghost Robot Children",105);
      //  System.out.println("$"+pokemon.getPrice());
       // System.out.println("Available seats:"+pokemon.getAvSeats());
        //System.out.println(pokemon.getDescription());
        System.out.println(pokemon);
        System.out.println(ironman);
        System.out.println(fnaf);



    }
}
