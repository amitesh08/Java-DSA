import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr2d = {
                            {2,5,1},
                            {8,12,4,80},
                            {56,12,45}
                             };

        for (int row=0;row< arr2d.length;row++) {    //output
            System.out.println(Arrays.toString(arr2d[row]));
        }

        int target = 12;
        int[] ans = search(arr2d, target);
        System.out.println("the index at which element present at : "+Arrays.toString(ans));

    }
    static int[] search(int[][] arr2d, int target) {
        for (int row = 0; row<arr2d.length; row++) {
            for (int col = 0; col< arr2d[row].length; col++) {
                if (arr2d[row][col] == target) {
                    return new int[]{row, col};

                }
            }
        }
        return new int[]{-1, -1};
    }
}
