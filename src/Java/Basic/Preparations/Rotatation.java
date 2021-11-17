package Java.Basic.Preparations;

import java.util.Scanner;

public class Rotatation {
    public static void main (String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int d = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();
            int z=d;
            while(z-->0){
                int temp = arr[0];
                for(int i=1; i<n; i++){
                    arr[i-1] = arr[i];
                }
                arr[n-1] = temp;
            }
            for(int i=0; i<n; i++) System.out.print(arr[i]+" ");
            System.out.println();
        }
    }
}
