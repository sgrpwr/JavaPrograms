package Java.Basic.Programs.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        System.out.println(search(arr, 12));
    }

    private static boolean search(int[] arr,int element) {
        if(0<arr.length){
            int mid;
            int right = arr.length-1;
            int left = 0;
            while (left<=right){
                mid = left + (right-left)/2;
                if(element == arr[mid]) return true;
                if(arr[mid]<element) left = mid+1;
                else right = mid-1;
            }
        }
        return false;
    }
}
