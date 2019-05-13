package easy;

/**
 * Created by zhivkogeorgiev on 21.10.18.
 * https://leetcode.com/problems/monotonic-array/description/
 */
public class MonotonicArray {
    public static boolean isMonotonic(int[] A) {
        boolean increasing = A[0] <= A[A.length - 1];
        boolean decreasing = A[A.length - 1] <= A[0];
        for (int i = 0; i < A.length - 1; i++) {
            if (increasing && A[i] > A[i + 1]) {
                return false;
            } else if (decreasing && A[i] < A[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] input = {5, 4, 1};
        System.out.println(isMonotonic(input));
    }
}
