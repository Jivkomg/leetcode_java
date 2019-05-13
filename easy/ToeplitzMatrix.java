package easy;

/**
 * Created by zhivkogeorgiev on 15.10.18.
 * https://leetcode.com/problems/toeplitz-matrix/description/
 * 1 2 3 4 5
 * 8 1 2 3 4
 * 5 8 1 2 3
 */
public class ToeplitzMatrix {
    public static boolean isToeplitzMatrix(int[][] matrix) {
        for (int row = 1; row < matrix.length; row++) {
            for (int col = 1; col < matrix[0].length; col++) {
                if (matrix[row][col] != matrix[row - 1][col - 1]) {
                    return false;
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4},
                     {5, 1, 2, 3},
                     {9, 5, 1, 2}};

        System.out.println(isToeplitzMatrix(a));
    }
}
