package Day5;

public class string {
    public static void main(String[] args) {
        String s="Swati Sukla";
        System.out.println("String is :"+s);
        String s1=new String("Richa Dukla");

        System.out.println("String s1="+s1);



        //valueOf

        int value=30;
        String s2=String.valueOf(value);
        System.out.println(s2+10); //concate the string
        char c1='A';
        char c2='B';
        String a1=String.valueOf(c1);
        String a2=String.valueOf(c2);
        System.out.println(a1);
        System.out.println(a2);

        //indexOf

        String d1="I love programming ,we can solve real life problems";
        int index1=d1.indexOf("programming");
        int index2=d1.indexOf("real");
        System.out.println("Index1 is :"+index1);
        System.out.println("Index1 is :"+index2);

        // String index3=d1.indexOf("love",4);
        // System.out.println(index3);



    }
    
}
