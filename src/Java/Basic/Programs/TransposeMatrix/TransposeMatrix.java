package Java.Basic.Programs.TransposeMatrix;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] mtr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        int l= mtr.length;
        int[][] res = transposeKaroMatrixKo(mtr,l);
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    private static int[][] transposeKaroMatrixKo(int[][] mtr, int l) {
        int [][] barr = new int[l][l];
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                barr[i][j] = mtr[j][i];
            }
        }
        return barr;
    }
}
