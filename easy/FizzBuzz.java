package easy;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n){
        List<String> output = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i % 15 == 0) {
                output.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                output.add( "Fizz");
            }

            else if(i % 5 == 0){
                output.add( "Buzz");
            }
            else{
                output.add( "" + i);
            }
        }

        return output;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(fizzBuzz(input));

    }

}


















