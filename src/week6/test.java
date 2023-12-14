package week6;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
       //Scanner console = new Scanner(System.in);
       //console.nextLine();

        //Creating an instance of the Car Class
       Car Tesla = new Car("Tesla", "S", 2022, 18000);
       Car Honda = new Car("Honda", "Civic", 2020, 60000);
        System.out.println(Tesla.getYear());
        System.out.println(Tesla.color);

    }
}
