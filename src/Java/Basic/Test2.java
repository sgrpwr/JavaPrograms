package Java.Basic;

public class Test2 {

    public static void main(String[] args) {
        int n = 10;
        int sum = findSum(n);
        System.out.println(sum);
    }

    private static int findSum(int n) {
        int sum = 0;
        for (int i = 0; i <= Math.abs(n); i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        if(n<0) return -1*sum;
        else return sum;
    }

}
