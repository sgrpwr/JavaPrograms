package Java.Basic.Programs.Bubble;
//SagarShradhaSort algorithm.
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,-4,-4};
        int l = arr.length;
        int min, index=0,temp=0;
        for (int i=0; i<l; i++){
             min = arr[i];
            for (int j=i; j<l; j++){
                if(arr[j]<min){
                    min = arr[j];
                    index = j;
                }
            }
            if(min<arr[i]){
                temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
        for(int i=0; i<l; i++) System.out.println(arr[i]);
    }
}
