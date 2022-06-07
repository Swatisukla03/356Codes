package Day2;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Reverse2 {
    public static void main(String[]args){
        int arr[]={50,40,30,20,10};
        System.out.println("Before Reverse String :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        System.out.println("Reverse String:");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
