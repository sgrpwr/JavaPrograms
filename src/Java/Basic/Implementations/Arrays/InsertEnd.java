package Java.Basic.Implementations.Arrays;

public class InsertEnd {
    public static void main(String[] args) {
        int LA[] = {1,3,5,7,8};
        int item = 10, k = 3, n = 5;
        int i = 0, j = n;

        System.out.println("The original array elements are :\n");

        for(i = 0; i<n; i++) {
            System.out.println("LA[%d] = %d \n" + i +" " + LA[i]+" ");
        }

        n = n + 1;

        while( j >= k) {
            LA[j+1] = LA[j];
            j = j - 1;
        }

        LA[k] = item;

        System.out.println("The array elements after insertion :\n");

        for(i = 0; i<n; i++) {
            System.out.println("LA " + i + " " + LA[i]+" ");
        }
    }
    //}

    private static int[] insertAtTheEnd(int[] oneDArray, int length, int position, int item) {
        length = length + 1;
        int i = 0, j = length;
        while ( j >= position ){
            oneDArray[j+1] = oneDArray[j];
            j = j - 1;
        }
        oneDArray[position] = item;
        for (int element : oneDArray) System.out.print(element + " ");
        return oneDArray;
    }
}
