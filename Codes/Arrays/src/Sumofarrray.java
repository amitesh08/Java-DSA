import java.util.Arrays;
import java.util.Scanner;

public class Sumofarrray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int[] arr=new int[sc.nextInt()];

        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("array are = "+ Arrays.toString(arr));

        int sum=0;
        for (int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("sum of array is = "+sum);
    }
}
