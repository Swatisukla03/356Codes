package Day4;

import java.util.ArrayList;

public class ForEachArraylist {
    public static void main(String[] args){
        ArrayList<String>cars=new ArrayList<>();
        cars.add("Audi");
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Range Rover");

        for(String i:cars){
            System.out.println(i);
        }
    }
    
}
