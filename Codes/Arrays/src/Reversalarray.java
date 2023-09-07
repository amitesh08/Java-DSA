import java.util.Arrays;
import java.util.Scanner;

public class Reversalarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5};

        System.out.println("array : "+ Arrays.toString(arr));

        for (int i=arr.length-1;i>=0;i--) {
            System.out.print(arr[i] + " ");
        }

//        int i = arr.length-1;
//        while (i>=0)
//        {
//            System.out.print(arr[i] +" ");
//            i--;
//        }
    }
}
