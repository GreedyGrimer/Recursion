package week6;

public class Car {
  //If you're creating a method don't use Main, you don't intend to run it.

        //Member Variables/Instant Variables/Fields
        String make,model,vin,color;
        private int year;
        int miles;
        boolean electric;


        //default constructor (initializes the variables)
        //constructors
        Car() { //Default if nothing is put in the variables

            this.year = 0;
            this.make = "Empty";
            this.model = "Empty";
            this.vin = "123456789";
            this.color = "White";

        }
        Car(String make, String model, int year, int miles){ //model if the variables are filled
            this.make = make;
            this.model = model;
            this.year = year;
            this.miles = miles;
        }
        //SETTERS AND GETTERS
    public void setYears(int YEARS){ //capitalization not normally recommended
            this.year = YEARS;

    }
    //GETTERS
    //(ACCESSOR Method)
    public int getYear(){
            return year;
    }









}
