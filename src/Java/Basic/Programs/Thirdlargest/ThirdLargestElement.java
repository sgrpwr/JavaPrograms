package Java.Basic.Programs.Thirdlargest;

import java.util.Arrays;

public class ThirdLargestElement {
    //main method
    public static void main(String[] args) {
        //initializing array
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(thirdLargestNikaloBhai(arr));
    }

    private static int thirdLargestNikaloBhai(int[] arr) {
        //calling sort method
        Arrays.sort(arr);
        return arr[arr.length-3];
    }
}
