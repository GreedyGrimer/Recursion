package Projects;

import java.util.Scanner;
import java.util.Random;
public class Project1 {
    public static void main(String[] args) {
        String name, move;
        double hp, power, speed;

        String name2, move2;
        double hp2, power2, speed2;
        int score = 0;
        int score2 = 0;

        Random rand = new Random();


        Scanner walmart = new Scanner(System.in);

        System.out.println("Enter an odd number of rounds:");

        int round = Integer.parseInt(walmart.nextLine());
        int cRound = 1;
        if(round%2 == 0){
            round+=1;
        }


        while(round >= cRound){

            System.out.printf("-------------------ROUND %d----------------------\n", cRound);



           System.out.println("Enter Info For Player 1");

            System.out.printf("Enter Name:");
            name = walmart.nextLine();

            System.out.printf("Enter %s's Move:",name);
            move = walmart.nextLine();

            System.out.printf("Enter %s's HP:",name);
            hp = Double.parseDouble(walmart.nextLine());

            System.out.printf("Enter %s's Move Power:",name);
            power = Double.parseDouble(walmart.nextLine());

            System.out.printf("Enter %s's Speed: ",name);
            speed = Double.parseDouble(walmart.nextLine());



            System.out.println("Enter Info For Player 2");

            System.out.printf("Enter Name:");
            name2 = walmart.nextLine();

            System.out.printf("Enter %s's Move:",name2);
            move2 = walmart.nextLine();

            System.out.printf("Enter %s's HP:",name2);
            hp2 = Double.parseDouble(walmart.nextLine());

            System.out.printf("Enter %s's Move Power:",name2);
            power2 = Double.parseDouble(walmart.nextLine());

            System.out.printf("Enter %s's Speed:",name2);
            speed2 = Double.parseDouble(walmart.nextLine());

            double x = ((speed+speed2)/2.0);
            double speedMod = rand.nextDouble(0, x); //Random Speed Modifier
            double speedMod2 = rand.nextDouble(0, x);

            double y = ((power+power2)/2.0);
            double powerMod = rand.nextDouble(0, y); //Random Power Modifier
            double powerMod2 = rand.nextDouble(0, y);


            while(hp>0 && hp2>0){
                if(speed + speedMod > speed2 + speedMod2){
                    hp2-=(power + powerMod);
                }else{
                    hp-=(power2+powerMod2);
                }

            }
            if(hp>hp2){
                System.out.println("Player 1 Wins!\n");
                score+=1;
            }else{
                System.out.println("PLayer 2 Wins!\n");
                score2+=1;
            }


            System.out.printf("Player 1 Score:%d\nPlayer 2 Score:%d\n", score, score2);
            cRound+=1;
        }
        if (score>score2){
            System.out.println("PLAYER 1 WINS THE BATTLE!");
        }else{
            System.out.println("PLAYER 2 WINS THE BATTLE!");
        }





    }
}
