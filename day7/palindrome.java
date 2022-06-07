package day7;

import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        String s1=sc.nextLine();
        System.out.println(ispalindrome(s1));   
        
    }
    public static boolean ispalindrome(String s1){
        int start=0;
        int end=s1.length()-1;
        while(start<end){
            if(s1.charAt((start))!=s1.charAt(end)){
                return false;

            }
            start++;
            end--;
        }
        return true ;
    }
    
}
