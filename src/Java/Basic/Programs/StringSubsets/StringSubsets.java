package Java.Basic.Programs.StringSubsets;

public class StringSubsets {
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str);
    }

    private static void findSubsets(String str) {
        int n = str.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
