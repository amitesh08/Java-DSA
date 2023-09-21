import java.util.Arrays;
import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        //Ques: find smallest and second smallest element in an array
        //OPTIMAL APPROACH
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of an array you want : ");
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("the array is : "+ Arrays.toString(arr));

        int ans = smallest(arr);
        System.out.println("the second smallest array in an array is : "+ans);

    }
    public static int smallest(int[] arr) {
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        for (int i=0; i< arr.length; i++) {     //second smallest element
            if (arr[i]<small) {
                second_small= arr[i];
                small = arr[i];
            } else if (arr[i]<second_small && arr[i] != small) {
                second_small = arr[i];
            }
        }
        return second_small;
    }
}
