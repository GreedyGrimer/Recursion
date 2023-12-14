package overLoaded;


public class TestClass {
    public static void main(String[] args) {

    employee john = new employee();
    employee jay = new employee(true);
    employee jones = new employee(3, 50, 32, 10);

        System.out.println(jay.getBehavior());
        System.out.println(jones.pay);





    }
}
