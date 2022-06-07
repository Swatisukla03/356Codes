package Day4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortEle {
    public static void main(String[]args){
        // ArrayList<String> cars=new ArrayList<>();
        // cars.add("Volvo");
        // cars.add("BMW");
        // cars.add("Ford");
        // cars.add("Mazda");
        // Collections.sort(cars);
        // for(String i:cars){
        //     System.out.println(i);
        // }

        //sorting the numbers

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(98);
        numbers.add(12);
        numbers.add(65);
        numbers.add(35);
        numbers.add(19);
        Collections.sort(numbers);

        for(int i:numbers){
            System.out.print(i+" ");
        }



    }
    
}
