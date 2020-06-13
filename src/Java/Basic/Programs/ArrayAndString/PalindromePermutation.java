package Java.Basic.Programs.ArrayAndString;

public class PalindromePermutation {

    public static boolean check(String s) {
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        int odd = 0;
        for (int i : arr) {
            if (i % 2 != 0) odd++;
        }
        return odd <= 1;
    }

    public static void main(String[] args) {
        String s = "Tact Coa";
        s = s.toLowerCase();
        s = s.replaceAll(" ", "");

        if(check(s)) System.out.println("True");
        else System.out.println("False");
    }
}
