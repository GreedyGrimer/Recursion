package week10.Interfaces;

public class CustomerInteract {
    private int cID;
    private String fName;
    private String lName;

    public CustomerInteract(String fName, String lName, int cID){
        this.fName = fName;
        this.lName = lName;
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


    public String FullInfo(){ return fName + " " + lName + " " + Integer.toString(cID);}






}
