package Java.Basic.Programs.Recursion;

public class Recursion1 {
    public static void main(String[] args) {
        recFun(5);
    }

    private static void recFun(int i) {
        if(i>0){
            recFun(i-1);
            System.out.println(i);
        }
    }
}
