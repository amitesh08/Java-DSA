import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr=new int[] {1,1,2,2,3,3,4,5,5,6};
        System.out.println("The array is :"+ Arrays.toString(arr));

        //after removing duplicate array number from the number
        int ans = remove(arr);   //ans will tell you about how many unique elements are in the array
        System.out.println("your final array is "+Arrays.toString(arr));

    }
    static int remove(int[] arr){
        int i=0;        //fixing initial value as it is always unique
        for (int j=1;j<arr.length;j++){
            if (arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
}
