package Java.Basic.Programs.BinarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        int num = 234523;
        int[] arr = {1,2,3,4,5,6,7,1234,23421,234523};
        String res = doesExist(num,arr);
        System.out.println(res);
    }

    private static String doesExist(int num, int[] arr) {
        int i=0, j = arr.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(num < arr[mid]){
                j = mid-1;
            }
            else if(num > arr[mid]){
                i = mid+1;
            }
            else{
                return "Found";
            }
        }
        return "Not Found";
    }
}
