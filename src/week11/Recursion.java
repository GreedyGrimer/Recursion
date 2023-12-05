package week11;

public class Recursion {


    public static void CountDown(int num){

        if(num == 0){
            System.out.println("BLAST OFF!!");
        }else{
            System.out.println(num);
            CountDown(num-1);

        }

        
    }


    public static void AlphaBack(char alpha){
        if(alpha == 'a'){
            System.out.println(alpha);

        }else{
            System.out.println(alpha);
            AlphaBack((char) (alpha-1));
        }
    }



}
