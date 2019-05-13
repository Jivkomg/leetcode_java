package easy; /**
 * Created by zhivkogeorgiev on 3/17/17.
 */
import com.sun.tools.javac.util.Convert;

import java.lang.StringBuilder;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < nums.length; i++){
            sb.append(nums[i]);
        }

        int output = 0;

        for(int i = 0; i < nums.length; i++){
            if(sb.indexOf(sb.substring(i, i + 1)) != sb.lastIndexOf((sb.substring(i, i + 1)))){
                continue;
            }
            else {
                 output =  Integer.parseInt(sb.substring(i, i + 1));
                 break;
            }
        }
        return output;
    }

    public static void main(String[] args){
        int[] input = new int[] {1, 4, 3, 1, 4};
        System.out.println(singleNumber(input));
        System.out.println(Math.sqrt(5));
    }
}
