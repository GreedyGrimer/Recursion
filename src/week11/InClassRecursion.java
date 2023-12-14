package week11;

public class InClassRecursion {
    public static void main(String[] args) {
        //Factorial
        //1. Base Case
        //2. Recursive Call + Modification
        int num = 7;
        System.out.println("The Factorial of 7 is "+factorial(num));

    }

    public static int factorial(int num){
        //1. Base Case
        if(num == 0){
            return 1;
        }else{
            //2. Recursive Call + Modification
            return num * factorial(num-1);
            //recursion is a method calling itself. We are using it to find the factorial of a number (7! = 7*6*5*4*3*2*1)
        }


    }
}
