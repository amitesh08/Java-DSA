import java.util.Arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println("Array : "+ Arrays.toString(arr));

        int ans = findMaxConsecutiveOnes(arr);
        System.out.println("the maximum consecutive ones are : "+ans);

    }
    static int findMaxConsecutiveOnes(int[] arr) {
        int max = 0;
        int count = 0 ;

        for (int i = 0; i<arr.length; i++) {
            if (arr[i]==1) {
                count++;
                if (count>max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        return max;
    }
}
