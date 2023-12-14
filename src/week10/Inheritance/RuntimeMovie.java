package week10.Inheritance;

public class RuntimeMovie extends Movie {
    int runtime;



    public RuntimeMovie(int price, int avSeats, String description, int runtime){
        super(price,avSeats,description);
        this.runtime = runtime;


    }
    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public int getRuntime(){
        return runtime;
    }



    @Override
    public String toString() {
        return String.format("Price: %d\nAvailable Seats:%d\nDescription: %s\nRuntime(min): %d\n", price,avSeats,description,runtime);
    }

}
