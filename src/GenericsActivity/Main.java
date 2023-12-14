package GenericsActivity;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        GenericMethods list = new GenericMethods();

        Integer[] numArray = {1,2,3,4,5,6,7,8,9,10};
        Double[] gpaArray = {2.1,3.1,3.5,3.9,4.0};
        Character[] alphArray = {'A','B','C','D'};
        String[] nameArray = {"Mason", "Jay", "Otis", "Greg"};

        System.out.println("IntArray: ");
        list.printArrayList(numArray);

        System.out.println("DoubleArray: ");
        list.printArrayList(gpaArray);

        System.out.println("CharArray: ");
        list.printArrayList(alphArray);

        System.out.println("StringArray: ");
        list.printArrayList(nameArray);
    }
}
