package Java.Basic.Programs.ContiguousArray;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,1,1,0};
        System.out.println(findMaxLength(arr));
    }

    private static int findMaxLength(int[] arr) {
        //1,1,0,0,1,1,0,1,1

        int sum = 0;
        /*for(int i : arr) {
            if(i==1) sum+=1;
            else sum-=1;
        }
        if(sum==0) return arr.length;
        sum=0;*/

        Map<Integer, Integer> map = new HashMap();
        map.put(0,-1);
        int maxLength=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==1) sum += 1;
            else sum -= 1;

            if(!map.containsKey(sum)){
                map.put(sum, i);
            } else{
                int len = i - map.get(sum);
                if(len>maxLength){
                    maxLength = len;
                }
            }
        }
        return maxLength;
    }
}
