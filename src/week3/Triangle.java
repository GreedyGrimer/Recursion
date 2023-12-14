package week3;

import javax.swing.*;

public class Triangle {
    public static void main(String[] args) {

        int A = Integer.parseInt(JOptionPane.showInputDialog("Input Triangle Side A: "));
        int B = Integer.parseInt(JOptionPane.showInputDialog("Input Triangle Side B: "));
        int C = Integer.parseInt(JOptionPane.showInputDialog("Input Triangle Side C: "));

        if (A == B && B == C){
            JOptionPane.showMessageDialog(null, "Your Triangle is Equilateral");
        }else if (A == B || A == C || B == C){
            JOptionPane.showMessageDialog(null, "Your Triangle is an Isosceles");
        }else{
            JOptionPane.showMessageDialog(null, "Your Triangle is Scalene");
        }




    }
}
