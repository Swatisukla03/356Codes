package Day4;

import java.io.Console;
import java.util.ArrayList;

public class ArraysList {
    public static void main(String []args){
        ArrayList<String>cars=new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Audi");
        System.out.println(cars);
        //accessing elements from the array
        System.out.println(cars.get(cars.size()-1));
        //setting the value of the element
        cars.set(0,"Maruti");
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);
    }
    
}
