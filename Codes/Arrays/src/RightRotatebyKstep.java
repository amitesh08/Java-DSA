import java.util.Arrays;

public class RightRotatebyKstep {
    public static void main(String[] args) {
        //Ques: Rotate the Array to the right by k steps.
        //#BRUTEFORCE
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k = 3;
        System.out.println("Array before Rotation : "+ Arrays.toString(arr));

        int[] ans = rotateArray(arr,n,k);
        System.out.println("Array after rotating by k step : "+Arrays.toString(ans));


    }

    static int[] rotateArray(int[] arr , int n, int k) {
//        k = k % n;
        int[] temp = new int[k];
        for (int i =n-k; i<n; i++) {        //basically need to improvise it because it only running for k=3 .
            temp[i-n+k] = arr[i];
        }

        for (int i = k; i >=0; i--) {       //shifting the element
            arr[i+k] =arr[i];
        }
        for (int i = 0; i<k; i++) {     //putting back to the array
            arr[i] = temp[i];
        }
        return arr;

    }
}
