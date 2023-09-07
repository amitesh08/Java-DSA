import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5};

//    accessing array using for loop
//    for (int i=0;i<arr.length;i++)
//       System.out.println(arr[i]);

//        using for each loop
/*        for (int num:arr) {
            System.out.println(num);
        }*/

        //using array to string method        ....best way to display array
        System.out.println(Arrays.toString(arr));


        //taking input from user
 /*       for (int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));*/

        String[] str=new String[5];
        for (int i=0;i<str.length;i++)
        {
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
