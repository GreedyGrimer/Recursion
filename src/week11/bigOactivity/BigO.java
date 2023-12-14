package week11.bigOactivity;

import java.lang.reflect.Array;

public class BigO {

    char[] character = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    public void printOnce(){
        System.out.println(character[0]);
    }
    public void printNTimes(){
        for (int i=0; i<Array.getLength(character); i++){
            System.out.println(character[i]);
        }
    }
    public void printNSquaredTimes(){
        for (int i=0; i<Array.getLength(character); i++){
            for (int x=0; x<Array.getLength(character); x++){
                System.out.println(character[i] + "." + i + "." + x);
            }
        }


    }

}
