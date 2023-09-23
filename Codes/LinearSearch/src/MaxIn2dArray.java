import java.util.Arrays;

public class MaxIn2dArray {
    public static void main(String[] args) {
        int[][] arr2d = {
                {2,5,1},
                {8,12,4,80},
                {56,12,45}
        };

        for (int row=0;row< arr2d.length;row++) {    //output
            System.out.println(Arrays.toString(arr2d[row]));
        }

        int ans = max(arr2d);
        System.out.println("the indexat which element present at : "+ans);

    }
    static int max(int[][] arr2d) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row<arr2d.length; row++) {
            for (int col = 0; col< arr2d[row].length; col++) {
                if (arr2d[row][col] > max) {
                    max = arr2d[row][col];
                }
            }
        }
        return max;

    }
}
