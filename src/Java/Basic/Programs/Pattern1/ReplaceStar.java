package Java.Basic.Programs.Pattern1;

public class ReplaceStar {

    public static void main(String[] args) {
        int n = 5;
        //Pattern1
        for(int i=1; i<=n; i++){
            for(int j=n; j>=1; j--){
                if(j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.print("\n");
        }
    }

}