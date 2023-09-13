import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr={3, 5 ,1, 6, 7,9};
        System.out.println("orginal array "+ Arrays.toString(arr));

        swap(arr ,1,5);

        System.out.println("after swapping the values " +Arrays.toString(arr));

    }
    static void swap(int[] arr,int index1 ,int index2){
        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2]= temp;
    }
}
