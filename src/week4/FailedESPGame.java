package week4;

public class FailedESPGame {
    public static void main(String[] args) {

        //int ranInt = (int)(Math.random() * (4 - 0 +1)) + 0;
        //int randomInteger = (int)(Math.random() * (max - min + 1)) + min;
        //the (int) converts what is supposed to be a double into an int


        //version from notes: int y = (int)Math.random() * 50 + 1;
        //meant to output random value between 1 and 50
        for(int n = 0; n<=50; n++){

            //antone version VVV
            //int z = (int)(Math.random() * 5);
            //double x = Math.random() * 50 + 1;
            int y = (int)(Math.random() * 50 + 1);
            System.out.println(y);
           // int num = (int)Math.random() * 50 + 1;
        //int num2 = (int)(Math.random() * (4 - 0 +1)) + 0;
            //System.out.println(num2);
            //System.out.println((int)Math.random() * 50 + 1);

        }
    }
}
