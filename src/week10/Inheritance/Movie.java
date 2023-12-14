package week10.Inheritance;

import java.util.Scanner;

public class Movie {

    protected int price;
    protected int avSeats;
    protected String description;

    Scanner walmart = new Scanner(System.in);

    public Movie(int price, int avSeats, String description){
        this.price = price;
        this.avSeats = avSeats;
        this.description = description;

    }


    public void setPrice(int price){
        this.price = price;
    }

    public String setAvSeats(String avSeats){

        System.out.println("Baks");
        this.avSeats = Integer.parseInt(walmart.nextLine());
        return avSeats;
    }

    public void setDescription(String description){
       this.description = description;
    }

    //Extras ^^^^^^



    public int getPrice(){

        return price;
    }

    public int getAvSeats(){

        return avSeats;
    }

    public String getDescription(){
       return description;
    }

    @Override
    public String toString() {
        return String.format("Price: %d\nAvailable Seats:%d\nDescription: %s\n", price,avSeats,description);
    }
}
