package Java.Basic.Implementations.Arrays;

//Linear Search. Time Complexity: O(n)
public class LinearSearch {
    public static void main(String[] args) {

        int[] oneDArray = {12,32,5,76,3,45,76};
        int[][] twoDArray = {{1,2,3},{4,5,6},{7,3,9}};
        String result = null;
        //result = searchInOneDArray(oneDArray, result);
        result = searchInTwoDArray(twoDArray, result);
        System.out.println(result);
    }

    public static String searchInOneDArray(int[] oneDArray, String result){
        int key = 76, count = 0;
        for (int element : oneDArray){
            if (element == key) count++;
        }
        result = count > 0 ? "Found "+count+" time" : "No luck";
        return result;
    }

    public static String searchInTwoDArray(int[][] oneDArray, String result){
        int key = 3, count = 0, i = 0;
        for (int[] eleArray : oneDArray){
            for(int element : eleArray){
                if (element == key){
                    count++;
                }
            }
        }
        result = count > 0 ? "Found "+count+" time" : "No luck";
        return result;
    }
}
