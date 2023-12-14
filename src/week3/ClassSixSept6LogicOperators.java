package week3;

import javax.swing.*;

public class ClassSixSept6LogicOperators {
    public static void main(String[] args) {
        // Logic Operators
        // && -> And
        // || -> Or
        // if(sunny || isWarm){
       // System.out.println("Lets get ice cream");
   // }




        //condition ? expression 1 : expression2

        int num = 11;
        String result = (num % 2 == 0) ? "Even" :"Odd";
        System.out.println("The number is : " + result);



        //switch statements vs switch expressions
        String planet = JOptionPane.showInputDialog(null, "Enter a planet");
        String planetInfo = "";
        switch(planet){
            case "earth":
                planetInfo = "Where we live now!";
                break;
            case "mars":
                planetInfo = "This is known as the Red PLanet";
            case "venus":
                planetInfo = "You entered venus";
                break;
            default:
                planetInfo = "The planet you entered is not valid. There is no info";
                break;
        }
        JOptionPane.showMessageDialog(null, planetInfo);



        //switch expression
        String planetExpress = JOptionPane.showInputDialog(null, "Enter a planet: ");
        String planetInfoExpress = switch (planetExpress){
            case "earth" -> "This is where you live";
            case "mars" -> "This is known as the red planet";
            case "venus" -> "You entered venus";
            default -> "The planet you entered is not valid. There is no info.";
          //switch expressions end with a ; on the outside of the brackets
        };
        JOptionPane.showMessageDialog(null, planetInfoExpress);
    }
}
