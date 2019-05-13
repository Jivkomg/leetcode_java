package easy;

/**
 * Created by zhivkogeorgiev on 3/9/18.
 * https://leetcode.com/problems/two-sum/description/
 */
public class TwoSum {
    // TODO Map
    public static int[] twoSum(int[] nums, int target) {
        int temp;
        int[] ans = {0,0};
        for (int i = 0; i < nums.length; i++) {
            temp = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == temp) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] input = new int[]{2, 7, 11, 15};
        for(int i = 0; i < 2; i++){
            System.out.println(twoSum(input, 9)[i]);
        }
        //System.out.println(twoSum(input, 9));
    }
}
