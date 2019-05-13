package easy;

import java.util.Scanner;

/**
 * Created by zhivkogeorgiev on 3/21/17.
 * https://leetcode.com/problems/number-complement/description/
 */
public class NumberComplement {
    public static int findComplement(int num) {
        String s = Integer.toBinaryString(~num);
        int temp = 0;
        for(int i = 0; i < 32; i++){
            if(s.charAt(i) == '0'){
                temp = i;
                break;
            }

        }
        String binaryAnswer = s.substring(temp + 1);
        System.out.println(binaryAnswer);
        int decimalAnswer = 0;
        for(int i = 0; i < binaryAnswer.length(); i ++){
            decimalAnswer = (int)binaryAnswer.charAt(i) - 48 + decimalAnswer * 2;
        }
        return decimalAnswer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(findComplement(input));



    }
}
