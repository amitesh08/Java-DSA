public class Main {
    public static void main(String[] args) {
        //finding element through binary search
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48 };
        int target = 36;

        int ans = binarySearch(arr, target);
        System.out.println(ans);


    }
    //find the index of the target
    //return index if found
    //else return -1 if not exist
    static int binarySearch(int[] arr, int target) {
        int start = arr[0];
        int end = arr.length - 1;


        while (start <= end) {
            int mid = (start + end) / 2;        //for finding the middle element

            if (target > arr[mid]) {        //if true then start element is now mid+1
                start = mid + 1;
            }
            else if (target < arr[mid]) {       //if true then end element is now mid-1
                end = mid-1;
            }
            else {
                return mid;     //return the final ans
            }
        }
        return -1;      //if element doesn't exist
    }
}