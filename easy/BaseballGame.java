package easy;

import com.sun.deploy.util.StringUtils;
import java.util.IntSummaryStatistics;
import java.util.Stack;

/**
 * Created by zhivkogeorgiev on 16.10.18.
 */
public class BaseballGame {
   public static int calPoints(String[] ops) {
        int sum = 0;
        Stack<Integer> integerStack = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            if (ops[i] == "D" && !integerStack.isEmpty()) {
                Integer doublePoints = integerStack.peek() * 2;
                integerStack.add(doublePoints);
            }
            else if (ops[i] == "C" && !integerStack.isEmpty()) {
                integerStack.pop();
            }
            else if (ops[i] == "+" && !integerStack.isEmpty()) {
                int last = integerStack.peek();
                int priorToLast = integerStack.elementAt(integerStack.size() - 2);
                integerStack.add(last + priorToLast);
            }
            else{
                integerStack.add(Integer.valueOf(ops[i]));
            }
        }
        for (Integer num : integerStack) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] input = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(input));
    }
}
