package overLoaded;

public class employee {
 //ALL CONSTRUCTORS MUST HAVE THE SAME NAME AS THE CLASS
int yearsWorked, weeklyHours, pay, overtime;
 boolean goodEmployee;



employee(){ //default
    this.yearsWorked = 0;
    this.weeklyHours = 40;
    this.pay = 11;
    this.overtime = 0;
}

employee(boolean goodEmployee){ //1 parameter
    this.goodEmployee = goodEmployee;

}
employee(int yearsWorked, int weeklyHours, int pay, int overtime){ //3 parameter
    this.yearsWorked = yearsWorked;
    this.weeklyHours = weeklyHours;
    this.pay = pay;
    this.overtime = overtime;

}

    public void getBehavior(boolean good) { //setter
    this.goodEmployee = good;

    }

    public boolean getBehavior() { return goodEmployee;}


    public void getPay(int payment) { //setter
        this.pay = payment;

    }

    public int getPay() { return pay;}








}

