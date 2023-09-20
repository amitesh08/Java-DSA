import java.util.Arrays;

public class SegregateArrayOptimised {
    public static void main(String[] args) {
        //Ques: Segregate 0's and 1's in an array.
        // #2. OPTIMAL APPROACH
        int[] arr = {0,1,0,1,0};
        System.out.println("the original array is : "+ Arrays.toString(arr));

        segregate(arr);     //calling the method
        System.out.println("after segregating 0's and 1's : "+Arrays.toString(arr));

    }
    public static void segregate(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            if (arr[i]==1) {        //so, here the program will only execute if it is at 1; else it will i++ until i=1
                if (arr[j]==0) {    //now if i==1 it will check if j===0 or not if it is 0 then it swap the value; else j-- until j==0
                    swap(arr,i,j);      //swapping the values using another method
                }
                j--;
            }
            i++;
        }
    }

    private static void swap(int[] arr, int i, int j) {     //swap method
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
