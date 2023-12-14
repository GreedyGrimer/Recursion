package week5;

import java.util.Scanner;
public class MethodsActivity {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
      double opLen =  getLength();
        double opWid = getWidth();
      double opArea =  getArea(opLen, opWid);
      displayData(opLen, opWid, opArea);





        scanner.close();
    } //Main Method



    //Other Methods
    public static double getLength(){
        String length;
        double tLength;

        System.out.println("Enter the length of the Rectangle:");
        length = scanner.nextLine();
        tLength = Double.parseDouble(length);


        return tLength;
    }
    public static double getWidth(){

        String width;
        double tWidth;


        System.out.println("Enter the width of the Rectangle:");
        width = scanner.nextLine();
        tWidth = Double.parseDouble(width);

        return tWidth;

    }

    public static double getArea(double tLength, double tWidth){

        return tLength*tWidth;
    }

    public static void displayData(double opLen, double opWid, double opArea){
        System.out.printf("Rectangle Length:%.3f\nRectangle Width:%.3f\nRectangle Area:%.3f\n",opLen, opWid, opArea);



    }

}
