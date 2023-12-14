package week2;

import javax.swing.*;

public class WordGame {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter Your Name: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        String city = JOptionPane.showInputDialog("Enter The Name of A City: ");
        String college = JOptionPane.showInputDialog("Enter The Name of Your College: ");
        String major = JOptionPane.showInputDialog("Enter Your College Major: ");
        String animal = JOptionPane.showInputDialog("Enter A Type of Animal: ");
        String petName = JOptionPane.showInputDialog("Enter Your Pet's Name: ");

       String game = String.format("There once was a person named %s who lived in %s. At the age of %d, %s went to college at %s. %s graduated with a %s major. Then, %s adopted a(n) %s named %s. They both lived happily ever after!", name, city, age, name, college, name, major, name, animal, petName);
       JOptionPane.showMessageDialog(null, game);








    }
}
