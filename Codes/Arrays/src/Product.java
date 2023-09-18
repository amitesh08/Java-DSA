import java.util.Arrays;

public class Product {
    public static void main(String[] args) {
        //Ques: product of array except self
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));

        int[] ans=ProductOfArray(arr);          //storing return value
        System.out.println(Arrays.toString(ans));


    }
    public static int[] ProductOfArray(int[] arr) {
        int[] res = new int[arr.length];        //product except self method
        for (int i=0;i<arr.length;i++){
            int product=1;
            for (int j=0;j<arr.length;j++){
                if (arr[i]!=arr[j]){
                    product*=arr[j];
                }
            }
            res[i]=product;
        }
        return res;     //returning array
    }
}
