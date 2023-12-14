package week2;

import javax.swing.*;

public class ClassFourAug29StringDialog {
    public static void main(String[] args) {

        //JOption Pane javax.swing includes JOption Pane
        String Fname = JOptionPane.showInputDialog("Enter Your Name: ");
        JOptionPane.showMessageDialog(null, "You entered : "+ Fname);



        //integer
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "You entered : "+ age);

        //double
        double gpa = Double.parseDouble(JOptionPane.showInputDialog("Enter your gpa: "));
        JOptionPane.showMessageDialog(null, "You entered : "+ gpa);

        //System.out.printf(" %d %n %s", age, Fname, etc); Reminder of how inserted variables are formatted
        String story = String.format("The story of the person blah blah blah %s%n age: %d%n gpa: %.2f%n" + "stuff",Fname ,age ,gpa);
        JOptionPane.showMessageDialog(null,story );



        //strings
        String name = "Robin";
        //.concat()
        name.concat("Tilford");
        System.out.println(name);
        name = name.concat(" Tilford");
        System.out.println(name);
        //Strings are special they are classes not variables, so you cant just rewrite or add to the strong
        //age = 9;
        //age = 11;
        //this process works with Ints but not strings


        //.length
        System.out.println(name.length()); //prints out length in characters

        //.charAt() -----> method in the String class
        System.out.println(name.charAt(4)); //will print the 4th character


        //.replace() -----> method in the String class
        System.out.println(name.replace("Robin Tilford", "Jacob"));

        //.substring()
        System.out.println(name.substring(0));
        System.out.println(name.substring(0,1));
        System.out.println(name.substring(0,4));








    }
}
