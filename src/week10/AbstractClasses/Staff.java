package week10.AbstractClasses;

public class Staff extends User{
    private int sID;

    public Staff(String fName, String lName, int sID){
        super(fName, lName);
        this.sID = sID;
    }
    public void setsID(int sID) {
        this.sID = sID;
    }

    public int getsID() {
        return sID;
    }

    @Override
    public String toString() {
        return String.format("First Name:%s\nLast Name:%s\nStaff ID:%d\n", fName, lName,sID);
    }
    @Override
    public String FullInfo(){ return fName + " " + lName + " " + Integer.toString(sID);}
}
