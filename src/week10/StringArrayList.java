package week10;

import java.util.ArrayList;
import java.util.Scanner;

public class StringArrayList {

    Scanner walmart = new Scanner(System.in);
    ArrayList<String> names;

    public StringArrayList(int size) {
        this.names = new ArrayList<>(size);
    }

   // public void addName(String length){
     //   names.add(length);
    //}
    public void setName(){
        boolean active = true;
       do{
            System.out.println("Add Name(q if done):");
            String name = walmart.nextLine();

            if (name.equalsIgnoreCase("q")){
                active = false;

            }else {
                names.add(name);
            }

        }while (active==true);



    }

    public void removeName(){
        System.out.println("Remove which name(position):");
        String remove = walmart.nextLine();
        names.remove(Integer.parseInt(remove));
    }

    public void getName(){
        System.out.println("Enter index of name:");
        String get = walmart.nextLine();
        names.get(Integer.parseInt(get));
    }


    public void getSize(){
        System.out.println(names.size());
    }


    public void display(){
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
    }

    public void displayAgain(){
        for(String x : names){
            System.out.println(names);
        }
    }







}
