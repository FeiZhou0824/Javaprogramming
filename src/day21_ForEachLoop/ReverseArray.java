package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {


        int [] numbers = {10,20,30,40,50};
        // {50,40,30,20,10

        int[] reversed = new int[ numbers.length];

        reversed [0] = numbers[numbers.length-1];
        reversed [1]= numbers[2];
        reversed[2] =numbers[1];
        reversed[3] = numbers[0];

        System.out.println(Arrays.toString(reversed));
        for (int  i = numbers.length - 1;  i >= 0;  i--) {
            
        }
        








    }
}
