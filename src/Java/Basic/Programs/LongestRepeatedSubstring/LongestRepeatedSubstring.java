package Java.Basic.Programs.LongestRepeatedSubstring;

public class LongestRepeatedSubstring {
    public static void main(String[] args) {
        String str = "abdfaabdfh";
        String res = findLongestRepeatedSubstring(str);
        System.out.println(res);
    }

    private static String findLongestRepeatedSubstring(String str) {
        int l = str.length();
        for (int i=0;i<l; i++){
            for (int j=i+1;j<=l; j++){
                System.out.println(str.substring(i,j));
            }
        }
        System.out.println("\n");
        return "asdf";
    }
}
