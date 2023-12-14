package week3;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = Integer.parseInt(number.nextLine());

        if(num%2 == 1){
            System.out.println("Your number is Odd");
        }else{
            System.out.println("Your number is Even");

        }


    }
}
