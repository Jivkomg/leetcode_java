package easy;

import java.util.*;
/**
 * Created by zhivkogeorgiev on 6/5/18.
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
 */
public class DisappearedInAnArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> uniqueSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            uniqueSet.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            int numsTemp = i + 1;
            if (!uniqueSet.contains(numsTemp)) {
                list.add(numsTemp);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
