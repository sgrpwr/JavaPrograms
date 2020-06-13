package Java.Basic.Programs.RemoveDuplicate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 1, 2};
        //int[] res = duplicateHataDalo(arr);
        //for(int i=0; i<arr.length; i++) System.out.print(res[i]);
    }

/*    private static  ArrayList<Integer> duplicateHataDalo(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int j=0;
        for (int i=0; i<arr.length; i++){

            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
                list.add(arr[])
            }
        }
        return res;
    }*/
}

