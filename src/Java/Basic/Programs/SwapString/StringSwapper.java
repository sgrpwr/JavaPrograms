package Java.Basic.Programs.SwapString;

public class StringSwapper {
    /*public static void main(String[] args) {
        String str1 = "SsAaGgRr";
        String str2 = "Pawaroooooooooooooooooooooooooooooo";
        System.out.println("S1: "+str1);
        System.out.println("S2: "+str2);
        str2 = str1+str2;
        str1 = str2.substring(str1.length());
        str2 = str2.substring(0,str2.length()-str1.length());
        System.out.println("S1: "+str1);
        System.out.println("S2: "+str2);
    }*/

    public static void main(String[] args) {
        String s = "sagar";
        char[] c = s.toCharArray();
         s = String.valueOf(c);
        System.out.println(s);
    }
}
