package week4;


import java.util.Random;
public class ClassTenSept15RandomNumberPractice {
    public static void main(String[] args) {

        //syntax--> Math.random()
        // will generate a value >= 0.0 and <1.0



        //syntax --> Random rand = new Random()
        //Has more control
        Random rand = new Random();


        for(int n=0; n<=100; n++){
            int randomInt = rand.nextInt(0,15); //numbers 0 - 15
            System.out.println(randomInt);
        }

    }
}
