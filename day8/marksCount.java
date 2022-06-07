package day8;

import java.util.Scanner;

public class marksCount {
    public static void main(String[] args) {
        
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Marks ");
            int marks=sc.nextInt();
            if(marks>90){
                System.out.println("excellent");
            }
            else if(marks>80 && marks <=90){
                System.out.println("good");
            }
            else if(marks<=80 && marks>70){
                System.out.println("fair");
            }
            else if(marks<=70  && marks>60){
                System.out.println("meets expectation");
            }
            else{
                System.out.println("below par");
            }
    
        }
    }
        