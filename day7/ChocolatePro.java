package day7;

import java.util.Arrays;
import java.util.Scanner;

public class ChocolatePro {


    public static int find( int arr[],int n,int m ){
        int ans=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<=n-m;i++ ){
            int min_val=arr[i];
            int max_value=arr[i+m-1];
            int gap=max_value-min_val;
            if(gap<ans){
                ans=gap;
            }
            
        }
        return ans;

    }
    public static void main(String[] args) {

        Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n] ;
        
        

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
       

       int ans=find(arr, n, m);
       System.out.println(ans);
        
    }
}
    
     
    

