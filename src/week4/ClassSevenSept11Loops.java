package week4;

public class ClassSevenSept11Loops {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        //for(Initialization ; condition ; incrementing)
        //initialize variables ; once condition is broken loop ends ; what happens at the end of each loop


        //print numbers 1-5 from array
        for(int n = 0;n < numbers.length; n++){

            System.out.println(numbers[n]);

        }

        //print numbers 1-10
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        //print even numbers 1-10
        for(int i = 1; i <= 10; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }




    }
}
