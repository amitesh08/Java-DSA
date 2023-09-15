import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        //check whether a array is sorted or not and return
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array :");
        int[] arr=new int[sc.nextInt()];

        for (int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("the arrray is :"+ Arrays.toString(arr));

        boolean sorted = isSorted(arr);
        System.out.println(sorted);

    }
    static boolean isSorted(int[] arr ){                //sort method
        //basically it compare its value to its previous one because it should be greater than equal to previous number to sorted
        for (int i =1;i<arr.length;i++){
            if (arr[i]>=arr[i-1]){

            }
            else {
                return false;
            }
        }
        return true;
    }
}
