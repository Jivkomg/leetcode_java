package easy;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by zhivkogeorgiev on 5/29/18.
 * https://leetcode.com/problems/product-of-array-except-self/description/
 */
public class Products {
    public static int[] productsMultiplication(int[] arr) {
        int[] ans = new int[arr.length];
        int[] leftArr = new int[arr.length];
        int[] rightArr = new int[arr.length];

        int tempMultiLeft = 1;
        int tempMultiRight = 1;

        leftArr[arr.length - 1] = 1;
        rightArr[arr.length - 1] = 1;

        for (int i = 0, j = arr.length - 1; i < arr.length - 1; i++, j--) {
            tempMultiLeft *= arr[i];
            leftArr[i] = tempMultiLeft;
            tempMultiRight *= arr[j];
            rightArr[i] = tempMultiRight;
        }

        for (int i = 0, j = arr.length - 3, k = 1; i < arr.length - 2; i++, j--, k++) {
            ans[k] = leftArr[i] * rightArr[j];
        }

        ans[0] = leftArr[arr.length - 1] * rightArr[arr.length - 2];
        ans[arr.length - 1] = leftArr[arr.length - 2] * rightArr[arr.length - 1];

        return ans;
   }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productsMultiplication(arr)));
    }
/*    2 3 4 5
lArr  2     2*3      2*3*4      1       i
rArr  5     5*4      5*4*3      1       j
    i3*j2   i0*j1    i1*j0    i2*j3

          1      2       3       4
ans       1*2  1*2*3   4*3*2    4*3

          1      2         3        4        5
ans       1    1*2*3     1*2*3    5*4*3     5*4
*/
}
