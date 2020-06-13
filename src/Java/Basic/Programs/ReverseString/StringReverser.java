package Java.Basic.Programs.ReverseString;

import java.util.regex.Pattern;

public class StringReverser {
    public static void main(String[] args) {
        String str = "hero is Sagar very good";
        str = reverseTheString(str);
        System.out.println(str);
    }

    private static String reverseTheString(String str) {
        Pattern pattern = Pattern.compile("\\s");
        String[] temp = pattern.split(str);
        String result = " ";
        for(int i=0; i<temp.length; i++) result = " " + temp[i] + result;
        return result;
    }
}
