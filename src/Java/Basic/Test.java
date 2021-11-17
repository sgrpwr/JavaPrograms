package Java.Basic;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        int res = findMissing(arr);
        if(res==-1) System.out.println("There is no missing number");
        else System.out.println("Missing number is : " + res);
    }
    private static int findMissing(int[] arr) {
        int j=0;
        for(int i=1; i<=arr.length; i++){
            if(i!=arr[j]){
                return i;
            }
            j++;
        }
        return -1;
    }
}
