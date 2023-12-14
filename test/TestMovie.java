
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week9.Movie;

import static org.junit.jupiter.api.Assertions.*;
public class TestMovie {

    private Movie Batman;
    private Movie Ironman;

    @BeforeEach
    public void Movie(){
        Batman = new Movie("Batman", "Crime", 120);
        Ironman = new Movie("Ironman", "Action/Comedy", 90);
    }
    
}
