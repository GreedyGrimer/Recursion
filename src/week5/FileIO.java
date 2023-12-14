package week5;


import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException; //excepts scanner
public class FileIO {
    public static void main(String[] args) throws FileNotFoundException { //excepts scanner

        //Instance of the File class
        File courseFile = new File("courses.txt");

        //Or if you don't know the file location
      //File file2 = new File("C:\Users\mason\OneDrive\Desktop\CS121\Sunflower\src\week5\FileIO.java");
        //Insert the absolute path

        try {
            // READ FILE
            Scanner scanner = new Scanner(courseFile);
            String header = scanner.nextLine();
            while (scanner.hasNextLine()) {
               /* String Line = scanner.nextLine();
                System.out.println(Line);
                //prints out every line in the text file*/

                String course = scanner.next(); //will read text file character by character
                int credits = Integer.parseInt(scanner.next());
                int score = Integer.parseInt(scanner.next());
                System.out.printf("%-7s %3d %7d\n", course, credits, score); //prints spaces between the names (7 spaces)
            }
        }catch( FileNotFoundException e){

            System.err.println("FILE NOT FOUND YOUR PATH HAS ISSUES IDIOT"); //custom error message
            //System.err pretty much just makes it red error text lol

            e.printStackTrace(); //tracks error



            //try catch is to Try this code{} if you cant find the file Catch it and do this {}
        }
    }
}


