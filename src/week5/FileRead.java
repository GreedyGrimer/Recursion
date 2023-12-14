package week5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {

        File grass = new File("rose.txt");


        try

    {
        // READ FILE
        Scanner scanner = new Scanner(grass);
        String header = scanner.nextLine();
        while (scanner.hasNextLine()) {
               String Line = scanner.nextLine();
               System.out.println(Line);
                //prints out every line in the text file

          //  String flower = scanner.next(); //will read text file character by character
           // String color = scanner.next();
            // System.out.printf("%s %s", flower, color); //prints spaces between the names (7 spaces)
        }
        scanner.close();
    }catch(
    FileNotFoundException e)

    {

        System.err.println("FILE NOT FOUND YOUR PATH HAS ISSUES IDIOT"); //custom error message
        //System.err pretty much just makes it red error text lol

        e.printStackTrace(); //tracks error
    }





}
}
