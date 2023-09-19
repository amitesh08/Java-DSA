import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        //Ques: find the missing number in the array
        int[] arr = {2,4,3,1,7,5,8,6,0};
        System.out.println(Arrays.toString(arr));
        int n =arr.length;
        int ans =missing(arr,n);        //storing the return value in int

        System.out.println("The missing number in the array is : "+ans);

    }
    public static int missing(int[] arr, int n ){
        int sum=n*(n+1)/2;      //here it is algebra formula which calculate sum of n naturals number
        int res=0;              //declare res to store sum of the given array
        for (int i = 0; i<n;i++){
            res+=arr[i];
        }
        return (sum-res);          //here subtracting the res from sum to get the missing number
    }
}
