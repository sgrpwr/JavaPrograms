package Java.Basic.Programs.Factorial;

public class Factorial {
    public static void main(String[] args){
        int n=5,r=1;
        while(n!=0){
            r*=n;
            n--;
        }
        System.out.println(r);
    }
}
