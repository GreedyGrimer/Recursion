package week9;

public class Movie {
    //Access modifiers / control access modifier / access specifier
    private String title;
    private String genre;
    private int runtime;

    private static int instanceCount = 0;
    //Static variable. Not going to be assigned to each instance individually, assigned to the class itself

    //default constructor
    public Movie(){
        instanceCount++;
    }

    //Parameterized Constructor
   public Movie(String title, String genre, int runtime){
       this.title = title;
       this.genre = genre;
       this.runtime = runtime;
       //Increments the static variable
       instanceCount++;

   }
   //SETTERS AND GETTERS
    //SETTERS
    public void setTitle(String title){
        this.title = title;
    }
    public void getGenre(String genre){
        this.genre = genre;
    }
    public void setRuntime(int runtime){
        this.runtime = runtime;
    }



    //GETTERS
    public String getTitle(){
        return title;
    }
    public String getGenre(){
        return genre;
    }
    public int getRuntime(){
        return runtime;
    }



}
