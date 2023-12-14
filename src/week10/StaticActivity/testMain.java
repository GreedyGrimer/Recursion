package week10.StaticActivity;

public class testMain {
    public static void main(String[] args) {



        person Joe = new person("Joe", 1000, 50000);
        person Jack = new person("Jack", 800000, 10000000);
        person John = new person("John", 300000, 70000000);


        System.out.printf("%s's debt is $%d\n", Joe.getName(), Joe.getDebt());
        System.out.printf("%s's debt is $%d\n", Jack.getName(), Jack.getDebt());
        System.out.printf("There are %d people\n", Jack.getPersonCount());
        System.out.printf("There are %d people\n", Joe.getPersonCount());
        System.out.printf("There are %d people", John.getPersonCount());















    }
}
