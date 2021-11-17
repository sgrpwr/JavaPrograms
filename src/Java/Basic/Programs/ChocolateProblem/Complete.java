package Java.Basic.Programs.ChocolateProblem;

 class Complete{

    public static void main(String[] args) {
        int arr[ ] = {5, 9, 2, 6};
        System.out.print(chocolates(arr, 3));
    }


    // Function for finding maximum and value pair
    public static int chocolates (int arr[], int n) {
        //Complete the function
        int i=0, j=n;
        while(i!=j){
            if(arr[i]==max(i,j, arr)){
                i++;
            } else{
                j--;
            }
        }
        return arr[i];
    }

    static int max(int i, int j, int[] arr){
        return arr[i]>arr[j] ? arr[i] : arr[j];
    }

}
