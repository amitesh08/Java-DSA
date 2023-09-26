import java.util.Arrays;

public class CreateTargetArray {
    public static void main(String[] args) {
        //Ques: Create Target Array In The Given Order.
        int[] nums = {0,1,2,3,4};
        int[] index = {0, 1, 2, 2, 1};

        int[] ans = targetArray(nums, index);
        System.out.println("the target array is : "+ Arrays.toString(ans));

    }
    static int[] targetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            target[index[i]] = nums[i];
        }
        return target;
    }
}
