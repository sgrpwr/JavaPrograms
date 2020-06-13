package Java.Basic.Programs.Armstrong;

public class Armstrong {
    public static void main(String[] args){
        int n= 407,d=0,sum=0;
        int temp=n;
        while(n!=0){
            d=n%10;
            sum+=d*d*d;
            n/=10;
        }
        if(temp==sum) System.out.println(sum + " The Number is Armstrong");
        else System.out.println(sum + " The Number not is Armstrong");
    }
}
