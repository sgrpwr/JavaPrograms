package Java.Basic.Programs.ShuffleArray;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int[] res = shuffle(arr, 3);
        for (int i : res) System.out.print(i+" ");
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int j = 0, k = 0;
        for(int i=0; i<2*n; i++){
            if(i%2==0){
                arr[i] = nums[k];
                k++;
            } else{
                arr[i] = nums[n+j];
                j++;
            }
        }
        return arr;
    }
}
