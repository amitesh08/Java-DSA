
import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        //Linear Search
        int[] arr = {2,4,-1,6,23,5,43,7,};
        int target = 4 ;
        System.out.println("the array is : "+ Arrays.toString(arr));

        int ans = searching(arr, target);  //calling the method.
        if (ans==1) {
            System.out.println("element found");
        }
        else {
            System.out.println("Element not found.");
        }


    }

   public static int searching(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i< arr.length; i++) {       //loop to find the element .
            if (arr[i] == target) {
                return 1;
            }
        }
        return Integer.MAX_VALUE;       //integer.max_value used what if there is a negative number in an array.
    }                                   //well we can return -1 also if the array elements are positive .
}
