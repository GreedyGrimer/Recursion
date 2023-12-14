package week10.Interfaces;

public class StaffInteract {
    private int sID;
    private String fName;
    private String lName;

    public StaffInteract(String fName, String lName, int sID){
        this.fName = fName;
        this.lName = lName;
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

    public String FullInfo(){ return fName + " " + lName + " " + Integer.toString(sID);}
}
