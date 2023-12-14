package week5;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        try{
            //instance of FileWriter and PrintWriter class
            FileWriter filewriter = new FileWriter("rose.txt", true);
            PrintWriter output = new PrintWriter(filewriter);
            String flower = JOptionPane.showInputDialog("Enter flower name:");
            String color = JOptionPane.showInputDialog("Enter flower color:");


            output.printf("%n%s %s ", flower, color);

            //closes out of PrintWriter and FileWriter class
            filewriter.close();
            output.close();


        }catch(FileNotFoundException e){
            System.err.println("File Issue");
        }


    }


}
