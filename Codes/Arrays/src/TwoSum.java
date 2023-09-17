import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("the array is :"+ Arrays.toString(arr));
        int target= 9;

        int[] ans=twosum(arr, target);      //here storing the return value in array variable   //and also passing the values for the method
        System.out.println("the two sum array is "+Arrays.toString(ans));

    }

    static int[] twosum(int[] arr, int target){         //to give two number which adds up to the target number
        int[] res=new int[2];
        for (int i=0;i<arr.length;i++){                 //we use nested for loop as we have to fix 1 index first then check with other indexes
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==target){
                    res[0]=arr[i];
                    res[1]=arr[j];
                    break;
                }
            }
        }
        return res;
    }
}
