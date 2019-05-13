package easy;

/**
 * Created by zhivkogeorgiev on 3/11/18.
 */
public class ReverseInteger {
    static public int reverse(int x) {
        int countDigits =  (int)Math.log10((double) Math.abs(x));
        int temp;
        int ans = 0;
        for(int i = 0; i < countDigits; i++){
            temp = x % 10;
            x /= x;
            ans += temp * Math.pow(temp, i);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}
