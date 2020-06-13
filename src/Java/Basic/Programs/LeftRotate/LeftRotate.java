package Java.Basic.Programs.LeftRotate;

public class LeftRotate {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        for(int i=0; i<arr.length; i++) System.out.print(arr[i]);
        int[] res = rotateKaroBhai(arr);
        System.out.print("\n");
        for(int i=0; i<arr.length; i++) System.out.print(res[i]);
    }

    private static int[] rotateKaroBhai(int[] arr) {
        int temp =arr[0];
        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        return arr;
    }
}
