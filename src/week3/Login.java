package week3;

import javax.swing.*;

public class Login {
    public static void main(String[] args) {

        String trueuName = "mdudley";
        String truepWord = "muncie2023";
        String uName = JOptionPane.showInputDialog("Enter Your User Name: ");
        String pWord = JOptionPane.showInputDialog("Enter Your Password: ");


        if (uName.equals(trueuName) == true && pWord.equals(truepWord) == true) {
            JOptionPane.showMessageDialog(null, "Your User Name and Password is Correct (ACCESS GRANTED) Welcome to CS121");

        } else if (uName.equals(trueuName) == false && pWord.equals(truepWord) == false){
            JOptionPane.showMessageDialog(null, "Your User Name and Password are both1 Incorrect");

            }else{
            if (uName.equals(trueuName) == false){
                JOptionPane.showMessageDialog(null, "Your User Name is Incorrect");
            }
            if (pWord.equals(truepWord) == false) {
                JOptionPane.showMessageDialog(null, "Your Password is Incorrect");
            }


        }
    }
}
