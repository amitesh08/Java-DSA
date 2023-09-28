import java.util.Arrays;

public class LeftRotateby1Steps {
    public static void main(String[] args) {
        //Ques: Left Rotate the Array by 1 Step. #LEETCODE
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        System.out.println("the array before rotating : "+ Arrays.toString(arr));

        int[] ans = RotateArray(arr, n); //calling the method
        System.out.println("array after rotating left by 1 step : "+Arrays.toString(ans));


    }
    static int[] RotateArray(int[] arr, int n) {
        int temp = arr[0];      //so, here we are storing 1st value(1) in a temporary variable to access it later.
        for (int i = 1; i< n; i++) {        //running loop from i=1 so arr[1] can be init by arr[i].
            arr[i-1] = arr[i];  //here we are replacing the value of i to i-1 and later store temp in last element (n-1)
        }
        arr[n-1] = temp;        //finally storing the value to last element

        return arr;
    }

}
