package week13;

import java.util.Objects;
public class HashMapActivityTest {
    public static void main(String[] args) {
        HashMapActivity ex = new HashMapActivity();

        ex.addPop("muncie",50);
        ex.addPop("indi",1100);
        ex.addPop("nyc",5000);
        ex.displayPop();

        System.out.println(ex.getPop("nyc"));
        ex.removePop("nyc");
        System.out.println(ex.getPop("nyc"));
        ex.displayPop();
    }
}
