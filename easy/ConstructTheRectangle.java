package easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by zhivkogeorgiev on 5/6/17.
 * https://leetcode.com/problems/construct-the-rectangle/description/
 */
public class ConstructTheRectangle {
    public static int[] constructRectangle(int area) {
        //l = 4 w = 1
        for(int i = (int)Math.sqrt(area); i > 0; i-- ){
            if(area % i == 0){
                return new int[]{area / i,i };
            }
        }
        return new int[]{0, 0};
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.printf(Arrays.toString(constructRectangle(input)));

    }

}
