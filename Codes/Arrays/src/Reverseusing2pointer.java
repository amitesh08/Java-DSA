import java.util.Arrays;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class Reverseusing2pointer {
    public static void main(String[] args) {
        int[] arr ={3, 5, 7, 8, 12, 1};
        System.out.println("original array :"+ Arrays.toString(arr));

        reverse(arr);

        System.out.println("reverse array :"+ Arrays.toString(arr));
    }
    static void reverse(int[] arr){             //this will for both even and odd number of lengths
        int start=0;
        int end=arr.length-1;
        while (start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr,int index1 ,int index2){             //simple swap function
        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2]= temp;
    }
}
