package Java.Basic.Programs.Divisor;

public class PrintDivisors {
    public static void main(String[] args) {
        int n = 100;

        //Algorithm 1
        for(int i=1; i<=n; i++){
            if(n%i==0) System.out.print(i+" ");
        }

        System.out.println();

        //Algorithm 2
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                if(n/i==i) System.out.print(i+" ");
                else System.out.print(i+ " " + n/i+" ");
            }
        }
    }
}
