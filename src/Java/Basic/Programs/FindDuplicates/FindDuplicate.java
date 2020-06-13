package Java.Basic.Programs.FindDuplicates;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {0,1,3,5,7,7,2,6,8,8,9,-1,-1};
        findDuplicates(arr);
    }

    private static void findDuplicates(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                System.out.println(arr[i]);
            }
            else{
                map.put(arr[i], i);
            }
        }
    }
}
