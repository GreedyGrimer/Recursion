package week4;

import java.util.Scanner;
public class TestAverage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("How many students are there:");
        int student = Integer.parseInt(console.nextLine());
        System.out.println("How many test scores per student:");
        int test = Integer.parseInt(console.nextLine());
        int total = 0;
        int score = 0;
        double avg = 0;

        for(int n=1; n <= student; n++){
            System.out.printf("Student %d:\n--------------------------\n", n);
            total = 0;
            for(int i=1; i <= test; i++){

                System.out.printf("Enter score for test %d:",i);
                score = Integer.parseInt(console.nextLine());
                total = total + score;
                avg = (double)total/test;

            }
            System.out.printf("Student %d's average score: %.3f\n\n", n, avg);



        }

    }
}
