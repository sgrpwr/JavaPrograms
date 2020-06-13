package Java.Basic.Programs.Fibonacci.series;

public class Fibonacci {
    public static void main(String[] args){
        int a1=0, a2=1,a3;
        System.out.print("Fibonacci Series: ");
        System.out.println(a1+","+a2+",");
        for(int i=0; i<8; i++) {
            a3 = a1 + a2;
            System.out.print(a3 + ",");
            a1 = a2;
            a2 = a3;
        }
    }
}
