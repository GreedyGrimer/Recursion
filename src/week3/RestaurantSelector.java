package week3;

import javax.swing.*;

public class RestaurantSelector {
    public static void main(String[] args) {

        String Veg = JOptionPane.showInputDialog("Is anyone in the party Vegetarian: ");
        String Vegan = JOptionPane.showInputDialog("Is anyone in the party Vegan: ");
        String gFree = JOptionPane.showInputDialog("Is anyone in the party Gluten-free: ");
        boolean V, Va, Gf;

        String A = "Joe's Gourmet Burgers";
        String B = "Main Street Pizza Company";
        String C = "Corner Cafe";
        String D = "Mama's Fine Italian";
        String E = "The Chef's Kitchen";


        if(Veg.equalsIgnoreCase("yes")){
            V = true;
        }else{
            V = false;
        }

        if(Vegan.equalsIgnoreCase("yes")){
            Va = true;
        }else{
            Va = false;
        }

        if(gFree.equalsIgnoreCase("yes")){
            Gf = true;
        }else{
            Gf = false;
        }

        if(!V && !Va && !Gf){

            JOptionPane.showMessageDialog(null, String.format("Here are your restaurant options:\n %s\n%s\n%s\n%s\n%s",A, B, C, D, E));

        } else if (Va) {
            JOptionPane.showMessageDialog(null, String.format("Here are your restaurant options:\n %s\n%s",C,E));
            
        } else if (Gf){

            JOptionPane.showMessageDialog(null, String.format("Here are your restaurant options:\n %s\n%s\n%s", B, C, E));
        } else if (V) {

            JOptionPane.showMessageDialog(null, String.format("Here are your restaurant options:\n %s\n%s\n%s\n%s", B, C, D, E));
        }



    }

    }

