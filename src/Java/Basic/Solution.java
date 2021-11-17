package Java.Basic;

public class Solution {

    /*Given n non-negative integers representing an elevation map where the width of each bar is 1,
     compute how much liquid it can trap.
     Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
    Output: 6
    */

    public static void main(String[] args) {

        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        int n = arr.length-1; //row
        int m = arr[0].length-1; //column

        int res = findWater(arr, n, m);

    }

    private static int findWater(int[][] arr, int n, int m) {

        int count = 0;
        int step = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){

                int d = 0;


            }
        }

        return 0;
    }


}
