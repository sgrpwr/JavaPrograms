package Java.Basic.Programs.FindFreq;
import java.util.HashMap;
import java.util.Map;

public class FindFrequency {

    public static void main(String[] args) {
        int[] arr = {1,5,7,3,5,2,1,4,9,5,2,3,7,9,5,3,2,6,3,6,78,3,5,7,3};
        findF(arr);
    }

    private static void findF(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if(freq.containsKey(arr[i])){
                freq.put(arr[i],freq.get(arr[i])+1);
            }
            else{
                freq.put(arr[i],1);
            }
        }
        System.out.println(freq);
    }
}
