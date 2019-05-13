package easy;

/**
 * Created by zhivkogeorgiev on 10/9/17.
 * https://leetcode.com/problems/judge-route-circle/description/
 */
public class JudgeRouteCircle {
    //TODO With stack
    public static boolean judgeCircle(String moves) {
        int cntDU = 0;
        int cntLR = 0;
        for(int i = 0; i < moves.length(); i++){
            String s = moves.substring(i,i+1);
            if(s.equals("D")) cntDU++;
            else if(s.equals("U")) cntDU--;
            if(s.equals("R"))cntLR++;
            else if (s.equals("L"))cntLR--;
        }
        if(cntDU == 0 && cntLR == 0){
            return true;
        }
        return false;


    }
    public static void main(String[] args){
        String s = "URDL";
        System.out.println(judgeCircle(s));
    }
   //l  U   r
    //  D

}
