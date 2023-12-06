package week9;

public class Array {
    public static void main(String[] args) {
        //Declare an Array

        int [] years; //pt1
        String [] name = new String [3]; //Array Size pt1 & 2
        years = new int[5]; //pt2

        //Data type [] nameOfArray = new Data type [size];

        float [] gpa;
        gpa = new float [9];
        final int maxCapacity = 30;
        int [] classRoomSize = new int [maxCapacity];


        //Process the Array
        String [] names = {"Mason", "Jay", "Otis", "Antone", "Ethan", "Greg"};
        System.out.println(names[0]);

        for (int i = 0; i<6; i++){
            System.out.println("The names in the array are: # "+(i+1) + " " + names[i]);



        }
        //Alternate non-Hard Coded loop
        //for (int i = 0; i<names.length; i++){
        //  System.out.println("The names in the array are: # "+(i+1) + " " + names[i]);
        //}

        // years[]
        years[1]++; //post
        ++years[1]; //pre

        if(names[1].length() < names[3].length()){

        }

    }
}
