package week13;

import java.util.HashMap;

public class MapNotes {

    //There area 3 main categories of collection interface
    // Lists, Sets, Maps (Maps are more different than the other 2
    //A map is a collection of a pair of objects
    //1. a value: This is the object to be stored
    //2. a key:

    //Map is a generic interface: Map<K,V> K for key V for Value
    // HashMap<typeValue,typeKey>name = new HashMap<>();
    //to add you use the .put() method
    //to remove use the .remove() method
    public static void main(String[] args) {

        HashMap<String,String> language = new HashMap<>();
        language.put("America","English");
        language.put("Taiwan","Mandarin");
        language.put("Russia","Russian");
        language.put("Japan","Japanese");


        language.remove("Russia");
    }

}
