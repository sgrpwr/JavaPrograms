package Java.Basic.Programs.CountCharacters;

public class CountCharacters {
    public static void main(String[] args) {
        String str = "Sagar Pawar is very good person!";
        int l = str.length();
        int res = CountChar(str);
        System.out.println(res);
    }

    private static int CountChar(String str) {
        char[] arr = new char[str.length()-1];
        arr=str.toCharArray();
        int i=0,count=0;
        while(i<str.length()){
             if (arr[i] != ' ') count++;
             i++;
        }
        return count;
    }
}
