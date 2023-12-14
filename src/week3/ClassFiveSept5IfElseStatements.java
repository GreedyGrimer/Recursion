package week3;

public class ClassFiveSept5IfElseStatements {
    public static void main(String[] args) {

        /*
        if statements
        else-if statements
        else statements
        switch statements
         */
        boolean condition = true;
        boolean condition1 = true;
        boolean condition2 = false;

        //if statement
        if (condition) {
            //executes the code if the condition is true


            //else statement
        } else {
            //will execute code if condition is false

        }

        //else-if statement
        if (condition1) {

            //executes the code if condition1 is true

        } else if (condition2) {
            //execute code if condition 2 is true
        } else {
            //executes code if all conditions are false

        }


        //example
        int age = 24;

        if (age < 21) {

            System.out.println("You are 21 or younger.\n");
        } else {
            System.out.println("You are 21 or older. \n");
        }


        //relational operator
        // <, >, <=, >=, ==, !=
        //.equals() --> For Strings
        boolean csMajor, isStudent, isTeacher, isNotCsMajor, isTeacherCsMajor;
        csMajor = true;
        isStudent = false;
        isTeacher = true;
        isNotCsMajor = true;
        isTeacherCsMajor = true;

        if (csMajor == isStudent) {
            System.out.println("This person is a CS Major and Student");


        } else {
            System.out.println("One of the values for cs student or student is false");
        }

        String name = "mason";
        String name2 = "Mason";
        if (name.equals(name2)) {
            System.out.printf("The name %s is equal to name2 %s", name, name2);

        } else {
            System.out.println("The names are not equal");
            if (isTeacher != isStudent) {
                System.out.println("This is a teacher and may be a CS major");
            } else if (isTeacher == isTeacherCsMajor) ;

        }




    }
}



