package week4;

import java.util.Scanner;
public class ClassEightSept12MoreLoops {
    public static void main(String[] args) {

        //Instance of the scanner class
        Scanner console = new Scanner(System.in);

        //white(condition){// code}
        //do{ //code
        // }while(true) {}
        int num = 0;
        while(num <= 5){
            System.out.println("Number is: " + num);
            //incrementing num
            num++;
        }





        do{
            //code
            System.out.println( "Number is: " + num);
            //incrementing num
            num++;


        }while(num <= 5);


        String course;
        System.out.println("Please enter all courses");

        while (true) {


            course = console.nextLine();
            if (course.equals("q")) {
                break;

            } else {
                System.out.println(course);

            }
        }
            System.out.println("Thank you");

    }
}
