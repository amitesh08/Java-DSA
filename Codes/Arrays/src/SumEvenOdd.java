import java.util.Arrays;

public class SumEvenOdd {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,};
        System.out.println("array is :"+ Arrays.toString(arr));

        sum(arr);           //calling the function.
    }
    static void sum(int[] arr) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int j : arr) {          //simple program to check even and odd and storing it.
            if (j % 2 == 0) {
                sumEven += j;
            } else
                sumOdd += j;
        }

        System.out.println("sum of even number in array is :"+sumEven);
        System.out.println("sum of odd number in array is :"+sumOdd);
    }
}
