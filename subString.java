public class subString {
    public static void main(String[] args) {
        String s="I love programming";
        substrings(s);
    }
    public static void substrings(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                System.out.println(s.substring(i, j+1));
            }
        }
    }


    
}
