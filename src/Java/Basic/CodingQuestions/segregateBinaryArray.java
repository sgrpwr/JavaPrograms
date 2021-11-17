package Java.Basic.CodingQuestions;

public class segregateBinaryArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        int zeroCount = 0;
        for(int i: arr) if(i==0) zeroCount++;
        int j=0;
        for(int i: arr){
            if(zeroCount-->0){
                arr[j] = 0;
                j++;
            } else {
                arr[j] = 1;
                j++;
            }
        }
        for(int i: arr) System.out.print(i+" ");
    }
}
