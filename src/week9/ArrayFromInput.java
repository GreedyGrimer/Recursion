package week9;

import java.util.Scanner;



public class ArrayFromInput {
    public static void main(String[] args) {
        String [] cities = new String [3];
        float [] population = new float [3];
        String [] parks = new String [3];

        Scanner walmart = new Scanner(System.in);

        for (int i = 0; i < cities.length; i++){
            System.out.println("Enter the city name " + (i+1) + ":" );
            cities[i] = walmart.nextLine();
            System.out.println("Enter the city population (in millions) " + (i+1) + ":" );
            population[i] = Float.parseFloat(walmart.nextLine());
            System.out.println("Enter the city park " + (i+1) + ":" );
            parks[i] = walmart.nextLine();
        }

        System.out.println("City\tPopulation\tPark");

        for (int i = 0; i<population.length; i++){
            System.out.println("City " +(i+1)+ ":" + cities[i] +"\t" + population[i] +"\t"+ parks[i] +"\t");

        }




    }
}
