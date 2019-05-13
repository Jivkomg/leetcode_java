package easy;
/**
 * Created by zhivkogeorgiev on 6/9/18.
 * https:leetcode.com/problems/sum-of-two-integers/description/
 * 1 5
 * a 001, b 101
 * ans: 110
 * r = 100
 * c = 001
 * a = 0
 * b = 101
 */
public class SumOfTwoIntegers {
    public static int getSum(int a, int b) {
        while(a != 0){
            int residue = a ^ b;
            int carry = a & b;
            a = carry << 1;
            b = residue;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(getSum(1, 5));
    }
}