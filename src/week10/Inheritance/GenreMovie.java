package week10.Inheritance;

public class GenreMovie extends Movie {
    private String genre;



    public GenreMovie(int price, int avSeats, String description, String genre){
        super(price,avSeats,description);
        this.genre = genre;

    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre(){
        return genre;
    }


    @Override
    public String toString() {
        return String.format("Price: %d\nAvailable Seats:%d\nDescription: %s\nGenre: %s\n", price,avSeats,description,genre);
    }
}
