package week2;

import java.util.Scanner;

public class ClassThreeAug28IntegerDiv {
    public static void main(String[] args) {

        //scanner class
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's your name?");
        String firstName = keyboard.nextLine();
        System.out.println(firstName);


        System.out.println("What is your age?");
        //int age = keyboard.nextInt(); //only works for one integer
        int age = Integer.parseInt(keyboard.nextLine()); //works for multiple

        System.out.println("What is your GPA");
        double gpa = keyboard.nextDouble();

        System.out.println(gpa);


        int numOne = 1;
        int numTwo = 4;
        //System.out.print(numOne/numTwo);
        //It will truncate and round down to 0 unless output as a double or float

        double results = (double) numOne/numTwo;
        //does double division
        double resultsTwo = (double)(numOne/numTwo);
        //does integer division then prints as a double
        System.out.print(results);
        System.out.print(resultsTwo);
    }
}
