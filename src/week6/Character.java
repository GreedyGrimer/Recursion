package week6;

public class Character {
    //ACCESS MODIFIERS:
    //Private (Accessible only within the class and its instances)
    //Public (Accessible anywhere in the program as long as there is an instance of the class to call from)
    //Private-Package "default"
    //Protected (Accessible by subclasses)


    //instance variables aka Fields
    String name, moveName;
   private int movePoints,hitPoints;
//these are just the templates of instance variables each character will have different variables

    //Constructors

    //default --> new Characters
    Character(String Name,String moveName){ //A1
        this.name = Name;
        this.moveName = moveName;

    }

    //Setters and Getters
    public void setName(String Name){
        this.name = Name; //name doesn't need to match the rest of the code using that variable

    }

    public void setMoveName(String moveName){
        this.moveName = moveName;
    }

    public void setMovePoints(int movePoints){
        this.movePoints = movePoints;
    }

    public void setHitPoints(int HP){
        this.hitPoints = HP;
    }
    // ^^^^^ SETTERS ^^^^^^^^^^ used to set the values

    //Getters VVVVVVV getting the values so the user can use them

    public String getName(){
        return name;
    }
    public String getMoveName(){
        return moveName;
    }
    public int getMovePoints(){
        return movePoints;
    }

    public  int getHitPoints(){
        return hitPoints;
    }


    //Encapsulation right now is being used to hold hidden information / hide data from the user






    //creating a method within the class
    //display method
    public void displayInfo(){ //void makes sure it doesn't return anything   // A2
        System.out.printf("This is the characters name: %s%n This is the characters move name: %s%n", name, moveName);

    }
}
