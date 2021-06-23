package Java.Basic.Implementations.Arrays;

public class FindSecondMaxMin {
    public static void main(String[] args) {
        int[] oneDArray = {12,32,5,76,3,45,76};
        int[][] twoDArray = {{1,2,3},{4,95,6},{7,3,9}};
        //int result = findSecondMinimumElement1D(oneDArray);
        //int result = findSecondMaximumElement1D(oneDArray);
        //int result = findSecondMinimumElement2D(twoDArray);
        int result = findSecondMaximumElement2D(twoDArray);
        System.out.println(result);
    }

    //Find minimum Brute-force approach O(n)
    private static int findSecondMinimumElement1D(int[] oneDArray) {
        int result = Integer.MAX_VALUE;
        int temp = oneDArray[0], min = result;
        for(int element : oneDArray){
            if(element<min) min = element;
        }
        for(int element : oneDArray){
            if(element<temp && element!=min) result = element;
        }
        return result;
    }

    //Find maximum Brute-force approach O(n)
    private static int findSecondMaximumElement1D(int[] oneDArray) {
        int result = Integer.MIN_VALUE;
        int temp = oneDArray[0], max = result;
        for(int element : oneDArray){
            if(element>max) max = element;
        }
        for(int element : oneDArray){
            if(element>temp && element!=max) result = element;
        }
        return result;
    }

    //Find second minimum Brute-force approach O(n*n)
    private static int findSecondMinimumElement2D(int[][] twoDArray) {
        int result = Integer.MAX_VALUE;
        int temp = twoDArray[0][0], min = result;
        for (int[] subArray : twoDArray){
            for (int element : subArray){
                if (element < min) min = element;
            }
        }
        for (int[] subArray : twoDArray){
            for (int element : subArray){
                if (element < result && element!=min) result = element;
            }
        }
        return result;
    }

    //Find second maximum Brute-force approach O(n*n)
    private static int findSecondMaximumElement2D(int[][] twoDArray) {
        int result = Integer.MIN_VALUE;
        int temp = twoDArray[0][0], max = result;
        for (int[] subArray : twoDArray){
            for (int element : subArray){
                if (element > max) max = element;
            }
        }
        for (int[] subArray : twoDArray){
            for (int element : subArray){
                if (element > result && element!=max) result = element;
            }
        }
        return result;
    }
}