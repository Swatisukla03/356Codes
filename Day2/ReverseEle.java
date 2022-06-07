package Day2;

public class ReverseEle {
    public static void main(String[]args){
        int arr[]={3,5,8,9,10,12};
        display(arr,6);
        reverseArray(arr,0,5);
        System.out.println("Reversed Array is ");
        display(arr,6);


    }
    public static void display(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void  reverseArray(int arr[],int start,int end){
        int temp;
       

        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    

    }
    

