package Java.Basic.Programs.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int num = 876;
        int[] arr = {243,324,12,35,2,1};
        String res = doesExist(num,arr);
        System.out.println(num + " has " + res);
    }

    private static String doesExist(int num, int[] arr) {
        for (int i=0;i<arr.length; i++){
            if(arr[i]==num) return "Found :)";
        }
        return "Did not find :(";
    }
}
