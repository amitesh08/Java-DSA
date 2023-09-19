import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        //Ques: Find the duplicate number in an array
        int[] arr={1,2,3,5,4,5};
        System.out.println(Arrays.toString(arr));
        int n =arr.length;

        int ans=duplicate(arr, n);
        System.out.println("the duplicate number in the array is : "+ans);

    }
    //note:- OPTIMISE THIS LATER AS IT DOES NOT PASS ALL THE TEST CASES , THIS IS BRUTE FORCE.
    public static int duplicate(int[]arr, int n){
        int d=0;
        for (int i=0;i<n;i++) {              //here it is checking the duplicate number through nested loop
            for (int j = i+1; j < n; j++) {     //here i+1 so that it won't return self value that why it starts with i+1
                if (arr[i] == arr[j]) {
                    d=arr[i];
                    break;
                }
            }
        }
        return d;
    }
}
