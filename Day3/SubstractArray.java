package Day3;

import java.util.Scanner;

public class SubstractArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]={1,2,9,4,5,12,13};
        int arr2[]={6,6,8,9,10};
        int c=0;
        int subtArray[]=new int[n];
        for(int i=0;i<arr1.length-1;i++){
            for(int j=0;j<arr2.length-1;j++){
                for(int k=0;k<subtArray.length-1;k++){
                    int d=0;
                    if(arr2[j]+c>=arr1[i]){
                        d=arr2[j]+c-arr1[i];
                        c=0;
                    }
                    else{
                        d=arr2[j]+c+10-arr1[i];
                        c=-1;
                    }
                    subtArray[k]=d;
                    i--;
                    j--;
                    k--;

                   
                }

            }
           
        }


    }
    
}
