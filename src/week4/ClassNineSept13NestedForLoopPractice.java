package week4;

public class ClassNineSept13NestedForLoopPractice {
    public static void main(String[] args) {

        //2D Array (Matrix)
        int [][] walmart = { //A matrix named walmart
                {11,12,13}, //0,0 / 0,1 / 0,2 etc
                {21,22,23},
                {31,32,33}
        };
        for(int i = 0; i < walmart.length; i++){
            System.out.println(" This is i = "+i);
            System.out.println(walmart[i][i] + " ");
            //prints 0,0 / 1,1 / 2,2
        }

    }
}
