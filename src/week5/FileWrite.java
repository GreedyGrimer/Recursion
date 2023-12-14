package week5;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        // instance of File and PrintWriter
        File outputFile = new File("rose.txt");
        PrintWriter output = new PrintWriter(outputFile);
        // Variables
        String flower, color;

        //Header
        output.printf("%s %s\n", "Flower","Color");
        for(int i = 1; i<= 3; i++){

            flower = JOptionPane.showInputDialog((String.format("Enter name of a flower:")));
            color = JOptionPane.showInputDialog("Enter the color of that flower:");

            output.printf("%s %s\n",flower,color);
        }
        //closes
        output.close();
    }
}


