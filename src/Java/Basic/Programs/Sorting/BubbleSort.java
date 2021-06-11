package Java.Basic.Programs.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,9,5,4};
        for (int element : arr) System.out.print(element+" ");
        System.out.println();
        sort(arr);
    }

    private static void sort(int[] arr) {
        int temp;
        boolean flag = false;
        for (int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!flag) break;
        }
        for (int element : arr) System.out.print(element+" ");
    }
}
