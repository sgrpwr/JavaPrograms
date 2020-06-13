package Java.Basic.Programs.IdentityMatrix;

public class IdentityMatrix {
    public static void main(String[] args) {
        int[][] mtx = {{1,0,0},{0,1,0},{0,1,1}};
        String res = isIdentityMatrix(mtx);
        System.out.println(res);
    }

    private static String isIdentityMatrix(int[][] mtx) {
        int l = mtx.length;
        int h = mtx[0].length;
        if(l!=h) return "not an Identity Matrix :(";
        else{
            for (int i=0; i<l; i++){
                for (int j=0; j<h; j++){
                    if(i!=j & mtx[i][j]!=0) return "not an Identity Matrix :(";
                    else if (i==j & mtx[i][j]!=1) return "not an Identity Matrix :(";
                }
            }
        }
        return "Yes, it is an Identity Matrix :)";
    }
}
