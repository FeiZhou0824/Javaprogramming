package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        int maxNumber = -2147483648; //any user entered number will be greater than -2147483648

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();
            if(num >maxNumber){  // if the user entered number is greater than current maximum number
                maxNumber = num;
            }
        }

        System.out.println("maxNumber = " + maxNumber);

        input.close();
    }
}
/*Write the program that ask the user to enter a number for 5 times.
return the maximum number
 */