package Projects.P2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class P2Stats {



    String name, move;
    double hp, power, speed;
        Random rand = new Random();
        Scanner walmart = new Scanner(System.in);
    ArrayList<String> Names = new ArrayList<String> ();
    ArrayList<String> Moves = new ArrayList<String> ();





    public int Round(){
        System.out.println("Enter an odd number of rounds:");
        int round = Integer.parseInt(walmart.nextLine());

        if(round%2 == 0){
            round+=1;
        }

        return round;

    } //Initialize Number of Rounds



   public String setName(String name){
       System.out.println("Enter Name:");
       name = walmart.nextLine();
       return name;
    }
    public String setMove(String move, String name){
        System.out.printf("Enter %s's Move:",name);
        move = walmart.nextLine();
        return move;
    }

    public double setHp(double hp, String name){
        System.out.printf("Enter %s's HP:",name);
        hp = Double.parseDouble(walmart.nextLine());
        return hp;
    }

    public double setPower(double power, String name){
        System.out.printf("Enter %s's Power:",name);
        power = Double.parseDouble(walmart.nextLine());
        return power;
    }

    public double setSpeed(double speed, String name){
        System.out.printf("Enter %s's Speed:",name);
        speed = Double.parseDouble(walmart.nextLine());
        return speed;
    }
        }







