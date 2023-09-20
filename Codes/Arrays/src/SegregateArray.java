import java.util.Arrays;

public class SegregateArray {
    public static void main(String[] args) {
        //Ques: Segregate 0's and 1's in an array.
        // #1. BRUTEFORCE
        int[] arr= {0,1,1,0};
        System.out.println("original array : "+ Arrays.toString(arr));

        segregate(arr);     //calling the method.
        System.out.println("after segregating 0's and 1's array is : "+Arrays.toString(arr));

    }
    public static void segregate(int[] arr) {
        int count = 0;      //it will count the occurrence of 0's in the array and store it.
        for (int i : arr) {
            if (i == 0) {
                count++;
            }
        }
        for (int i = 0; i<count; i++){      //here we are storing 0 till count that is till index 1 .
            arr[i]=0;
        }
        for (int i = count; i<arr.length; i++){     //similarly storing 1 from count [index-2] to array length[5].
            arr[i] = 1;
        }
    }
}
