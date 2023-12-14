package week1;

public class ClassTwoAug25 {
    public static void main(String[] args) {
        int age;
        double gpa;
        // 0.0 float and double are similar but double is more precise and takes up more space
        char letterGrade;
        boolean csMajor;
        String name;

        age = 19;
        name = "Mason";
        letterGrade = 'A'; //difference in char vs string is " "  vs ' '
        csMajor = false;
        gpa = 3.87;

        String favoriteColor = "Red";

        System.out.println("My favorite color is "+favoriteColor+".\nPeople who like blue are dumb." );
        System.out.printf("My name is %s \n",name);
        System.out.println("my gpa is " + gpa );
        System.out.printf("My current Animation211 grade is %s \n",letterGrade);
        System.out.println("System how old am i?:     "+age); //can use %d instead of %s for Int
        System.out.printf("System, true or flase i am a CS Major:    %s",csMajor);

    }
}
