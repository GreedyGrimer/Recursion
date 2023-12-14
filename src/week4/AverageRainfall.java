package week4;

import java.util.Scanner;
public class AverageRainfall {
    public static void main(String[] args) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        Scanner walmart = new Scanner(System.in);
        System.out.println("Enter Number of Years:");
        int year = Integer.parseInt(walmart.nextLine());
        int tRain = 0;


        for(int n=1; n<=year; n++){

            for(int i=0; i<months.length; i++){
                System.out.printf("Enter inches of rainfall for %s of year %d:", months[i], n);
                int rain = Integer.parseInt(walmart.nextLine());
                tRain = tRain + rain;

            }
            System.out.println("\n");

        }
        int time = year*12;
        double aRain = (double)tRain/time;
        System.out.printf("Total Months:%d\n",time);
        System.out.printf("Total Inches of Rainfall:%d\n",tRain);
        System.out.printf("Average Rainfall for %d Years:%.3f\n",year,aRain);
    }
}
