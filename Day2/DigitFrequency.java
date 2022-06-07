package Day2;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int freq_no=sc.nextInt();
        int result=getDigitFrequency(no, freq_no);
        System.out.println(result);
         

    }
    public static int getDigitFrequency(int no,int freq_no){
        int count=0;
        while(no>0){
            int digit=no%10;
            no=no/10;
            if(digit==freq_no){
                count++;
            }
        }
        return count;
    }

  
    
}
