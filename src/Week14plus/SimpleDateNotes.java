package Week14plus;

import javax.swing.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class SimpleDateNotes {
    public static void main(String[] args) {


        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");


        String DOB = JOptionPane.showInputDialog("Enter your birthday (mm/dd/yyyy):");

        String CurrentDay = JOptionPane.showInputDialog("Enter today's date (mm/dd/yyyy):");

        int day = 0;
        try {
            Date date1 = dateFormat.parse(DOB);
            Date date2 = dateFormat.parse(CurrentDay);
            //unix Epoch ----> January 1, 1970
            //Milliseconds, days, years
            long difference = date2.getTime() - date1.getTime();
            day = (int) TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
            double years = day/365.25;

            JOptionPane.showMessageDialog(null, String.format("Your Birthday is: %s%nThe Current Date is:%s%nYour Age is %d in Milliseconds%nYour Age is %d in Days%nYour Age is %.3f in Years", date1, date2, difference, day, years));


        } catch (ParseException e) {
            e.printStackTrace();

        }
    }
}
