package Java.Basic.Implementations.Arrays;

public class FindMinimumMaximum {
    public static void main(String[] args) {
        int[] oneDArray = {12,32,5,76,3,45,76};
        int[][] twoDArray = {{1,2,3},{4,95,6},{7,3,9}};
        //int result = findMinimumElement1D(oneDArray, result);
        //int result = findMaximumElement1D(oneDArray, result);
        //int result = findMinimumElement2D(twoDArray, result);
        int result = findMaximumElement2D(twoDArray);
        System.out.println(result);
    }

    //Find minimum Brute-force approach O(n)
    private static int findMinimumElement1D(int[] oneDArray) {
        int result = Integer.MAX_VALUE;
        for(int i=0; i<oneDArray.length-1; i++){
            if(oneDArray[i]< result) result = oneDArray[i];
        }
        return result;
    }

    //Find maximum Brute-force approach O(n)
    private static int findMaximumElement1D(int[] oneDArray) {
        int result = Integer.MIN_VALUE;
        for(int i=0; i<oneDArray.length-1; i++){
            if(oneDArray[i]> result) result = oneDArray[i];
        }
        return result;
    }

    //Find maximum Brute-force approach O(n*n)
    private static int findMaximumElement2D(int[][] twoDArray) {
        int result = Integer.MIN_VALUE;
        for (int[] subArray : twoDArray){
            for (int element : subArray){
                if (element > result) result = element;
            }
        }
        return result;
    }

    //Find maximum Brute-force approach O(n*n)
    private static int findMinimumElement2D(int[][] twoDArray) {
        int result = Integer.MAX_VALUE;
        for (int[] subArray : twoDArray){
            for (int element : subArray){
                if (element < result) result = element;
            }
        }
        return result;
    }
}
