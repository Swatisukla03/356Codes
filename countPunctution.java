public class countPunctution {
    public static void main(String[] args) {
        String s="My name is Swati Sukla ! What's urs? It is very nice to meet you.";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='!' || s.charAt(i)==',' ||s.charAt(i)=='?'||s.charAt(i)=='.'|| s.charAt(i)==':'||s.charAt(i)==';'||s.charAt(i)=='/'){
                count++;
                // System.out.print(count+" ");

            }
          
           

        }
        System.out.println(count+"");
        
    }
    
}
