package easy; /**
 * Created by zhivkogeorgiev on 3/12/17.
 */


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum2_Sorted {
    public static int[] twoSum(int[] numbers, int target) {
        int[] output = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while(numbers[left] + numbers[right] != target){
            if(numbers[left] + numbers[right] < target){
                left++;
            }
            else{
                right--;
            }
        }

        output[0] = left + 1;
        output[1] = right + 1;
        return output;
    }


    public static void main(String[] args){
        int[] input = new int[] {2, 4, 6};
        int t = 8;

        System.out.printf(Arrays.toString(twoSum(input, t)));

    }
}
