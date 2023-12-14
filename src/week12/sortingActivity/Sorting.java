package week12.sortingActivity;
import java.util.Scanner;

public class Sorting {

    int [] list = new int [5];
    Scanner walmart = new Scanner(System.in);

    public int[] getArray(){

        System.out.println("Enter 5 integers:");
        for (int i = 0; i< list.length; i++){
            list[i] = Integer.parseInt(walmart.nextLine());
        }




        
        return list;
    }
}
