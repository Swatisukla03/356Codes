package Day4;

public class WrapperClass {
    public static void main(String args[]){
        int a=11;
        Integer b=new Integer(a);
        Integer c=Integer.valueOf(a);
        Integer d=a;
        Integer e=a;
        System.out.println(d==e);
        System.out.println(b==d);
        System.out.println(a==c);
    }
    
}
