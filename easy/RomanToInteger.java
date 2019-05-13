package easy;

/**
 * Created by zhivkogeorgiev on 6/14/18.
 */
public class RomanToInteger {
    public static int romanToInt(String s) {
        char[] input = s.toCharArray();
        int ans = 0;
        for (int i = 0; i < input.length - 1; i++) {
            switch (input[i]) {
                case 'I':
                    if (input[i + 1] != 'X' && input[i + 1] != 'V') {
                        ans += 1;
                    } else ans -= 1;
                    break;
                case 'V':
                    ans += 5;
                    break;
                case 'X':
                    if (input[i + 1] != 'L' && input[i + 1] != 'C') {
                        ans += 10;
                    } else ans -= 10;
                    break;
                case 'L':
                    ans += 50;
                    break;
                case 'C':
                    if (input[i + 1] != 'D' && input[i + 1] != 'M') {
                        ans += 100;
                    } else ans -= 100;
                    break;
                case 'D':
                    ans += 500;
                    break;
                case 'M':
                    ans += 1000;
                    break;
            }

        }
        switch (input[input.length - 1]) {
            case 'I':
                ans += 1;
                break;
            case 'V':
                ans += 5;
                break;
            case 'X':
                ans += 10;
                break;
            case 'L':
                ans += 50;
                break;
            case 'C':
                ans += 100;
                break;
            case 'D':
                ans += 500;
                break;
            case 'M':
                ans += 1000;
                break;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}