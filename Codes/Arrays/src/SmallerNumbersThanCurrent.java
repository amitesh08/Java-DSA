import java.util.Arrays;

public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        //Ques: how Many Numbers Are Smaller than Current Number.
        int[] nums = {8,1,2,2,3};
        System.out.println("the array is : "+ Arrays.toString(nums));

        int[] ans = smaller_numbers(nums);
        System.out.println("the number smaller than in the array is : "+Arrays.toString(ans));
    }
    static int[] smaller_numbers(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0 ; i<nums.length; i++) {
            int count = 0;      //init a counter to count the numbers which are smaller than the element itself.
            for (int j = 0; j<nums.length; j++) {
                if (j!=i && nums[j]<nums[i]) {   //applying condition to check the smaller number
                    count++;
                }
            }
            arr[i]=count;       //then init it to new array.
        }
        return arr;
    }
}
