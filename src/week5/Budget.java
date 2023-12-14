package week5;

import javax.swing.*;

public class Budget {
    public static void main(String[] args) {
        //String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        //String.format()
        boolean loop = true;
        String quit = "";
        Double total = 0.00;

        Double budget = Double.parseDouble(JOptionPane.showInputDialog("What is your budget for a month:"));


        do{
            String expense = JOptionPane.showInputDialog("Enter all individual expenses. Enter q when finished.");
            if(expense.equalsIgnoreCase("q")){
                loop = false;

            }
            else {
               Double math = Double.parseDouble(expense);
                System.out.println(math);
                total = total + math;

            }



        }while(loop==true);
        System.out.printf("Your budgeted expenses are: %.2f\n", budget);
        System.out.printf("Your total expenses are: %.2f\n", total);
        if(budget-total < 0){
            System.out.println("Your total expenses is greater than your budget. Balance your books.");

        }else{
            System.out.println("Your budget is greater than or equal to your total expenses. Good Job!");
        }







    }
}
