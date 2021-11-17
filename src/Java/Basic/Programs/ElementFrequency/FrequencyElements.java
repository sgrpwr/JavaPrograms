package Java.Basic.Programs.ElementFrequency;

import java.util.ArrayList;

public class FrequencyElements {
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15,16}};
        ArrayList<Integer> l = spirallyTraverse(arr, 4,  4);

    }

    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int k=0, l=0;
        while(k<r && l<c){
            for(int i=l; i<r; i++){
                list.add(matrix[k][i]);
            }
            k++;
            for(int i=k; i<c; i++){
                list.add(matrix[i][r-1]);
            }
            c--;
            if(k<r){
                for(int i=c-1; i>=l; i--){
                    list.add(matrix[r-1][i]);
                }
                r--;
            }

            if(l<c){
                for(int i=r-1; i>=k; i--){
                    list.add(matrix[i][l]);
                }
                l++;
            }
        }
        return list;
    }
}
