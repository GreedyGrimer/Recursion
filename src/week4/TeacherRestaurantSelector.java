package week4;

import java.util.Scanner;
public class TeacherRestaurantSelector {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        System.out.println("Is anyone in your party Vegan?");
        String vegan = console.nextLine();
        System.out.println("Is anyone in your party Vegetarian?");
        String vegetarian = console.nextLine();
        System.out.println("Is anyone in your party Gluten Free?");
        String gluten = console.nextLine();


        System.out.println("Here are your restaurant choices:\n");
        if(vegan.equalsIgnoreCase("no")){
            System.out.println("Main Street Pizza Company. \n");
        }
        if(vegan.equalsIgnoreCase("no") && gluten.equalsIgnoreCase("no")){
            System.out.println("Mama's Fine Italian. \n");

        }
        if (vegan.equalsIgnoreCase("no") && vegetarian.equalsIgnoreCase("no") && gluten.equalsIgnoreCase("no")){
            System.out.println("Joe's Gourmet Burgers. \n");
        }
        System.out.println("The Chef's Kitchen. \n");
        System.out.println("Corner Cafe. \n");


    }
}
