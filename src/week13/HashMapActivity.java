package week13;

import java.util.HashMap;
import java.util.Map;

public class HashMapActivity {

    public Map<String,Integer> popMap = new HashMap<>();



    public void addPop(String city, int pop){
        popMap.put(city, pop);
    }
    public void removePop(String city){
        popMap.remove(city);
    }
    public Object getPop(String city){
        Object pop;
        if(popMap.containsKey(city)){
            pop = popMap.get(city);
        }else {
            pop = "City not in database";
        }

        return pop;
    }

    public void displayPop(){
        popMap.forEach( (city,pop) -> {
            System.out.printf("City:%s\nPopulation(in 1000s):%d\n\n",city,pop);
        });
    }
}
