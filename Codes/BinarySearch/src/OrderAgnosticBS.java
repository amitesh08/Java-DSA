public class OrderAgnosticBS {
    public static void main(String[] args) {
        //Lets say we don't know whether a array is sorted in ascending order or in descending order.
        int[] arr = {99, 44, 22, 20, 13, 11, 5, 1};
        int target = 20;

        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);


    }
    //find the index of the target
    //return index if found
    //else return -1 if not exist
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean is_Asc;
        is_Asc = arr[start] < arr[end];   //clean code which means same as below.
        /*
                if (arr[start] < arr[end] ){
                    is_Asc = true;
                }
                else {
                    is_Asc = false;
                }
        */


        while (start <= end) {
            int mid = (start + end) / 2;        //for finding the middle element


            if (arr[mid]==target){
                return mid;
            }

            if (is_Asc){
                if (target > arr[mid]) {        //if true then start element is now mid+1
                    start = mid + 1;
                }
                else if (target < arr[mid]) {       //if true then end element is now mid-1
                    end = mid-1;
                }
            }
            else {
                if (target < arr[mid]) {        //if true then start element is now mid+1
                    start = mid + 1;
                }
                else if (target > arr[mid]) {       //if true then end element is now mid-1
                    end = mid-1;
                }
            }
        }
        return -1;      //if element doesn't exist
    }
}

