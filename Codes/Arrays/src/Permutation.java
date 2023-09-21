import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        //Ques: Build Array From Permutation.
        int[] arr = {0,2,1,5,3,4};
        System.out.println("the array is : "+ Arrays.toString(arr));

        int[] ans = buildArray(arr);    //calling the method and storing it in array as it is returning an array
        System.out.println("the array is : "+ Arrays.toString(ans));

    }
    public static int[] buildArray(int[] arr) {
        int[] arr2 =new int[arr.length];        //storing in anther array
        for (int i=0;i<arr.length;i++) {
            arr2[i]=arr[arr[i]];         //here formula was given in the question iut is easy
        }
        return arr2;
    }
}
