
import java.util.Arrays;
import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of the array : ");
        int[] arr=new int[sc.nextInt()];
        for (int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("your array is : "+ Arrays.toString(arr));

        System.out.print("enter the you want to search in the array :");
        int value= sc.nextInt();

        boolean ans=SearchArray(arr,value);             //passing value and array to the method
        if (ans){
            System.out.println("array found.");
        }
        else
            System.out.println("array number not found.");

    }
    static boolean SearchArray(int[] arr, int value){          //checks the array and return in boolean form
        for (int i =0;i<arr.length;i++){
            if (arr[i]==value){
                return true;
            }
        }
        return false;
    }
}
