import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        //Ques: Running sum od 1D Array.
        int[] arr = {1,2,3,4};
        int n = arr.length;
        System.out.println("the array is : "+Arrays.toString(arr));

        int[] ans = sum(arr,n);
        System.out.println("the running sum of array is : "+Arrays.toString(ans));


    }

    static int[] sum(int[] arr, int length) {
        int [] arr2 = new int[length];      //creating new array to store running sum .
        int add = 0;
        for (int i = 0; i<length; i++) {
            add += arr[i];      //here adding every element of the array  sequentially.
            arr2[i] = add;      //finally storing the add element in the new array .
        }
        return arr2;        //returning the array .
    }
}
