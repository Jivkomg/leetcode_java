package easy; /**
 * Created by zhivkogeorgiev on 5/2/17.
 * https://leetcode.com/problems/add-digits/description/
 */
import java.util.Scanner;

public class AddDigits {

//    ONLY INTEGER
//    public static int addDigits(int num) {
//        int firstSum = 0;
//        while (num > 9){
//            firstSum += num % 10;
//            num /= 10;
//        }
//        firstSum += num;
//
//        int secondSum = firstSum % 10 + firstSum / 10;
//        if(secondSum < 10){
//            return  secondSum;
//        }
//        else {
//            int thirdSum = secondSum / 10 + secondSum % 10;
//            if(thirdSum < 10){
//                return thirdSum;
//            }
//            else return thirdSum / 10 + thirdSum % 10;
//        }
//    }
//    ONLY INTEGER; RECURSION
//    public static int firstSum(int num){
//        int sum = 0;
//        while (num > 9){
//            sum += num % 10;
//            num /= 10;
//        }
//        sum += num;
//        return sum;
//    }
//    public static int addDigits(int num){
//        if(num < 10){
//            return num;
//        }
//        else{
//            return addDigits(num / 10 + num % 10);
//        }
//    }
    public static int addDigits(int num){
        int sum = 0;
        while(num > 9){
            sum += num %10;
            num /= 10;

        }
        sum += num;
        if(sum < 10){
            return sum;
        }
        else return addDigits(sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(addDigits(input));

    }
}