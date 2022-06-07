package day6;

import Day5.string;

//array to string
public class ArrayString {
    public static void main(String[] args) {
        char[] ch={'a','b','c','d'};
        String st=String.valueOf(ch);
        String s2= new String(ch);

        System.out.println(st);
        System.out.println(s2);
        
    }
    
}
