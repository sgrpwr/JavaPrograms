package Java.Basic.Programs.ContainsDuplicate;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {


    static boolean findSol(int[] nums){
        Map<Integer, Integer> map = new HashMap();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            } else{
                map.put(nums[i], 1);
            }
        }
        for(int num: nums){
            if(map.get(num)>1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,1,1,1,1,1};
        System.out.println(findSol(nums));
    }
}
