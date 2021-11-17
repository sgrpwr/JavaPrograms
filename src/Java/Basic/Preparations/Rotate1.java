package Java.Basic.Preparations;

class Rotate1 {
    /* Function to left rotate arr[] of size n by d */
    static void leftRotate(int arr[], int d)
    {
        if (d == 0) return;
        int n = arr.length;
        // in case the rotating factor is
        // greater than array length
        d = d % n;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    /*Function to reverse arr[] from index start to end*/
    static void reverseArray(int arr[], int start, int end)
    {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /*UTILITY FUNCTIONS*/
    /* function to print an array */
    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 4, 5};
        int d = 3;

        leftRotate(arr, d); // Rotate array by d
        printArray(arr);
    }
}