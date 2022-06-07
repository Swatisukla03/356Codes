import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        String  s;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");

        s=sc.nextLine();
        System.out.println("reverse the array");
        for(int i=s.length();i>0;i--){
            System.out.print(s.charAt(i-1));
        }

        System.out.println();
        
    }
    
}
