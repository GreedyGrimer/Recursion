package week4;

import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String answer = "";
        System.out.println("Enter a number between 1-100 (Enter q to quit game)\n");
        int correct = 45;
        int guess = 0;

        while(true){

            answer = console.nextLine();
             if (answer.equalsIgnoreCase("q")) {
                System.out.println("Thank you for playing.");
                 System.out.printf("The number was: %d", correct);
                break;
            }

            int num = Integer.parseInt(answer);
            guess++;
            if (num < 0 || num > 100) {
                System.out.println("Error: Guess is out of range. Try Again.");
            } else if(num > correct){
                System.out.println("Too High! Guess again.\n");
            } else if (num < correct) {
                System.out.println("Too Low! Guess again.\n");
            }else if (num == correct) {
                System.out.println("CORRECT! Thank you for playing!");
                System.out.printf("You guessed %d times", guess);
                break;
            }
        }





    }
}
