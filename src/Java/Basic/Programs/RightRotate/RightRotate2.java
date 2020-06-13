package Java.Basic.Programs.RightRotate;

public class RightRotate2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        for(int i=0; i<arr.length; i++) System.out.print(arr[i]);
        int res[] = rotateKaroBhai(arr);
        System.out.print("\n");
        for(int i=0; i<arr.length; i++) System.out.print(res[i]);
    }

    private static int[] rotateKaroBhai(int[] arr) {
        int temp =arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        return arr;
    }
}
