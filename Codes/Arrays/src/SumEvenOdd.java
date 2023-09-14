import java.util.Arrays;

public class SumEvenOdd {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,};
        System.out.println("array is :"+ Arrays.toString(arr));

        sum(arr);
    }
    static void sum(int[] arr) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sumEven += arr[i];
            } else
                sumOdd += arr[i];
        }

        System.out.println("sum of even number in array is :"+sumEven);
        System.out.println("sum of odd number in array is :"+sumOdd);
    }
}
