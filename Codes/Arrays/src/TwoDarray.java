import java.util.Arrays;
import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*int [][] arr2d= {
                {1, 2, 3},  // 0th index
                {4, 5, 6},  //1st index
                {7, 8, 9},  //2nd index
        };*/

        /*for (int row=0;row< arr2d.length;row++) //for row in array
        {
            for (int col=0;col<arr2d[row].length;col++) // for every col in row
                System.out.print(arr2d[row][col]+" ");  //output
            System.out.println();
        }
        for (int row=0;row< arr2d.length;row++){    //output
            System.out.println(Arrays.toString(arr2d[row]));
        }*/

        int[][] arr=new int[3][3];
        System.out.println(arr.length);
        for(int row=0;row<arr.length;row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
//        for (int row=0;row< arr.length;row++){    //output
//            System.out.println(Arrays.toString(arr[row]));

        for(int[] a : arr) {            //printing using for enhanced loop as it arrays of arrays thats y it is int[]
            System.out.println(Arrays.toString(a));
        }

    }
}
