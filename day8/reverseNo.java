package day8;

import java.util.Scanner;

public class reverseNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int  digit=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            System.out.print(digit);

        }
        
    }
    
}
