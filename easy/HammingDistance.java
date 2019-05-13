package easy;

/**
 * Created by zhivkogeorgiev on 8/7/17.
 */
public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        String s1 = Integer.toBinaryString(x);
        String s2 = Integer.toBinaryString(y);
        String max = "";
        if(s1.length() > s2.length()){
            max = s1;
            for(int i = 0; i < s1.length() - s2.length() + 1; i++){
                System.out.println(s1.length() - s2.length());
                s2 = '0' + s2;
            }
        }
        else if(s1.length() <= s2.length()){
            max = s2;
            for(int i = 0; i < s2.length() - s1.length() + 1; i++){
                System.out.println(s2.length() - s1.length());
                s1 = '0' + s1;
            }
        }


        int cnt = 0;

        System.out.println(s1);
        System.out.println(s2);
        for(int i = 0; i < max.length(); i++){
            if (s1.charAt(i) != s2.charAt(i)) {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        System.out.println(hammingDistance(12,84));
    }
}
