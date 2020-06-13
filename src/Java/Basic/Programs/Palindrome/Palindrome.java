package Java.Basic.Programs.Palindrome;

public class Palindrome {
    public static void main(String[] args){
        int n=123454321,d=0,r=0;
        int temp=n;
        while(n!=0){
            d=n%10;
            r = r*10+d;
            n=n/10;
        }
        if(temp==r)System.out.println(r + " is palindrome");
        else System.out.println(n + " is not a palindrome");
    }
}
