package week9;

public class TwoDArray {
    public static void main(String[] args) {

        int number [][] = {{1,2,3},
                          {4,5,6},
                          {7,8,9}
        };


        String[][] names = { //works on Columns and Rows
                //0     1       2
                {"Mason", "Jay", "Otis"}, //0
                {"Greg", "Antone", "Ethan"}, //1
                {"Evie", "Ally", "Jojo"} //2

        };


        System.out.println(names[1][2]); //Ethan
        //top to bottom then left to right
        System.out.println(names[2][0]); //Evie


    }
}
