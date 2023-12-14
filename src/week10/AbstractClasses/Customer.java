package week10.AbstractClasses;

public class Customer extends User{
    private int cID;

    public Customer(String fName, String lName, int cID){
        super(fName, lName);
        this.cID = cID;
    }


    public void setcID(int cID) {
        this.cID = cID;
    }

    public int getcID() {
        return cID;
    }


    @Override
    public String toString() {
        return String.format("First Name:%s\nLast Name:%s\nCustomer ID:%d\n", fName, lName,cID);
    }

    @Override
    public String FullInfo(){ return fName + " " + lName + " " + Integer.toString(cID);}






}
