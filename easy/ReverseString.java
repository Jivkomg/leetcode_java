package easy; /**
 * Created by zhivkogeorgiev on 3/12/17.
 */
import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String s) {
      char[] output = new char[s.length()];

        for(int i = s.length() - 1, j = 0; i >= 0; i--, j++)
        {
            output[j] = s.charAt(i);
        }
        String temp = new String(output);
        return temp.substring(0, s.length());

//      return new StringBuilder(s).reverse().toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(reverseString(input));


    }
}
