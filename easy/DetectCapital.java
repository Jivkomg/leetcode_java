package easy;

import java.util.Scanner;

/**
 * Created by zhivkogeorgiev on 7/25/17.
 * https://leetcode.com/problems/detect-capital/description/
 */
public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        int cnt = 0;
        for (int i = 0; i < word.length(); i++) {
            if ((int) word.charAt(i) < 96) {
                cnt++;
            }
        }
        if ((cnt == 1 && word.charAt(0) < 96) || cnt == word.length() || cnt == 0) {
            return true;
        } else return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(detectCapitalUse(input));

    }
}