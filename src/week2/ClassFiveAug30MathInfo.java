package week2;


import java.util.Scanner;

public class ClassFiveAug30MathInfo {
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


        System.out.println("Enter your first integer: ");
        int numOne = Integer.parseInt(console.nextLine());

        System.out.println("Enter your second integer: ");
        int numTwo = Integer.parseInt(console.nextLine());

        //Addition
        int add = (numOne + numTwo);
        System.out.printf(" %d + %d = %d%n",numOne,numTwo,add);

        //Subtraction
        int subtract = (numOne - numTwo);
        System.out.printf(" %d - %d = %d%n",numOne,numTwo,subtract);

        //Multiplication
        int multiplication = (numOne * numTwo);
        System.out.printf(" %d * %d = %d%n",numOne,numTwo,multiplication);

        //Division
        int division = (numOne / numTwo);
        System.out.printf(" %d / %d = %d%n",numOne,numTwo,division);

        //Square Roots
        double sqrt1 = Math.sqrt(numOne);
        System.out.printf("The square root of %d is %.2f%n",numOne,sqrt1);
        //%f is float %d is Int %s is String %.2f is %f but to only 2 decimal places

        //Power
        double power = Math.pow(numOne, numTwo);
        System.out.printf("The power of %d and %d is %.2f%n",numOne,numTwo,power);

        //Logarithm
        double log = Math.log(numOne);
        System.out.printf("The log of %d is %.2f%n",numOne,log);

        //Math.abs() Absolute Value
        //Math.max() Will show the Max of two numbers
        //Math.min() Will show the Min of two numbers
        //Math.round() Rounds a double (Will become an integer)


        // EXTRA NOTE: % divides then outputs the remainder 2/2 remainder is 0 so 2%2 = 0   3%2 = 1






    }
}
