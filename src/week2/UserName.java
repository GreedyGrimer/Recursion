package week2;

import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = console.nextLine();

        //Lower Case
        System.out.println(name.toLowerCase());

        //Upper Case
        System.out.println(name.toUpperCase());

        //Reverse
        //Creating an instance or an object of the string builder class
        StringBuilder reverseName = new StringBuilder(name);
        System.out.println(reverseName.reverse());
    }
}
