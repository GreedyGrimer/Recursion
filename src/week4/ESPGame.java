package week4;

import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
        String[] color = {"red", "green", "blue", "orange", "yellow"};
        String player = "";
        Scanner aldi = new Scanner(System.in);
        Random walmart = new Random();
        int total = 0;
        for (int n = 1; n <= 10; n++) {
            int kroger = walmart.nextInt(5); //randomize answer
            String answer = color[kroger]; //create answer
            System.out.printf("%d. What color has the computer chosen?: ",n);//ask question
            player = aldi.nextLine();//player answer
            boolean star = player.equalsIgnoreCase(answer); // is the answer correct
            System.out.printf("The computer chose:%s\n\n",answer);
            if(star == true){
                total = total + 1;
            }

        }
        System.out.printf("You got %d of 10 correct", total);













    }
}
