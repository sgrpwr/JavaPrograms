package Java.Basic.Programs.Thirdlargest;

import java.util.Arrays;

public class ThirdLargestElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(thirdLargestNikaloBhai(arr));
    }

    private static int thirdLargestNikaloBhai(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-3];
    }
}
