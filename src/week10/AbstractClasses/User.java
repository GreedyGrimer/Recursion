package week10.AbstractClasses;

public abstract class User {

    protected String fName;
   protected String lName;


    public User(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getlName() {
        return lName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfName() {
        return fName;
    }

    @Override
    public String toString() {
        return String.format("First Name:%s\nLast Name:%s\n", fName, lName);
    }


    public abstract String FullInfo();
}
