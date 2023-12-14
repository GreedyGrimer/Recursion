package week6;

public class CharacterTest {
    public static void main(String[] args) {
        //Create instance of character class
        Character characterOne = new Character("Blaze", "FireBall"); //A1
        Character characterTwo = new Character("Ice Queen", "Frost Wind"); //A1
        //keep name consistent
       // System.out.println(characterOne.hitPoints);
        //accessing the default constructor


        characterOne.displayInfo();//A2
        characterTwo.displayInfo();//A2

      //  System.out.printf(characterOne.getName()); //Get and print CharacterOne name
    }
}
