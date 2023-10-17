import java.util.Arrays;

public class LongestSubarray {
    public static void main(String[] args) {
        //Ques: Longest Subarray with given Sum K(Positives).
        //OPTIMAL
        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        int k = 7;
        int n = arr.length ;
        System.out.println("the array is :"+Arrays.toString(arr));

        int ans = longestsubarray(arr,n,k);
        System.out.println("the longest subarray with given sum k is :"+ans);
    }

    static int longestsubarray(int[] arr, int n, int k) {
        int left = 0;
        int right = 0;
        int sum = arr[0];
        int maxlen = 0;

        while (right < n) {
            while (left <= right && sum > k) {       //if sum will be greater than k then simply subtract arr[left] in sum and jump to next element.
                sum -= arr[left];
                left++;
            }
            if (sum == k) {     //if found the sum then find the len and store it in maxlen if it is greater.
                maxlen = Math.max(maxlen, right - left + 1);
            }
            right++;        //right will always start 1 step ahead of left so that it can calculate the sum .
            if (right < n ) sum += arr[right];

        }
        return maxlen ;
    }
}
