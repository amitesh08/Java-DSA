import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of an array :");
        int[] arr=new int[sc.nextInt()];

        for (int i =0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("the array is :"+ Arrays.toString(arr));

        int max=0;
        int smax=1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max) {
                smax=max;
                max = arr[i];
            }
            if (arr[i]>smax && arr[i]<max) {
                smax = arr[i];
            }
        }
        System.out.println("maximum number is "+max);
        System.out.println("second maximum number is "+smax);
    }
}
