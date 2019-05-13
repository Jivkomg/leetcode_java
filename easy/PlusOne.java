//package easy;
//
//import java.util.Arrays;
//
///**
// * Created by zhivkogeorgiev on 23.10.18.
// */
//public class PlusOne {
//    public static int[] plusOne(int[] digits) {
//        int temp = 0;
//        for(int i = 0, j = digits.length - 1; i < digits.length; i++, j--){
//            temp += (int)Math.pow(10, (double) i) * digits[j];
//        }
//
//        return digits;
//    }
//
//    public static void main(String[] args) {
//        int[] input = {1,2,5};
//        System.out.println(Arrays.toString(plusOne(input)));
//    }
//}
