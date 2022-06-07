public class kadenAlgo {
    public static void main(String[] args) {
        int num[]={-2,1,-3,4,-1,2,-5,4,-6};
        int max_sum=Integer.MIN_VALUE;
        int curr_sum=0;
        for(int i=0;i<num.length;i++){
            curr_sum=curr_sum+num[i];
            if(curr_sum>max_sum){
                max_sum=curr_sum;
            }

            if(curr_sum<0){
                curr_sum=0;
            }


        
        }
        System.out.println(max_sum);

        
    }
    
}
