package easy;

import java.util.Scanner;

/**
 * Created by zhivkogeorgiev on 3/17/17.
 */
public class NimGame {
    public static boolean canWinNim(int n) {
        boolean isWinner = true;
        if (n % 4 == 0){
            isWinner = false;
        }
        return isWinner;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(canWinNim(input));
    }
}
