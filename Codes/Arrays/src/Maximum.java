import java.util.Arrays;
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter no. of arrays : ");
        int[] arr=new int[sc.nextInt()];

        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("arrays are : "+ Arrays.toString(arr));

        int maxval=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>maxval) {
                maxval = arr[i];
            }
        }
        System.out.println("maximum value in array is "+maxval);

    }
}
