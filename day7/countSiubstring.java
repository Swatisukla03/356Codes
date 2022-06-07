package day7;

public class countSiubstring {
    public static void main(String[] args) {
        String s="I love programming";
        System.out.println(countSS(s));
        
    }

    public static boolean isPalindrome(String s){
        int end=s.length()-1;

        int start=0;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
                
            }
            start++;
            end--;
        }
        return true;
    }

    public static int countSS(String st)
	{
		int count = 0;
		for(int i = 0; i < st.length(); i++)
		{
			for(int j = i; j < st.length(); j++)
			{
				if(isPalindrome(st.substring(i,j+1)))
				{
					count++;
				}
			}
            // return count;
		}
        return count;
	 
	}
    
}
