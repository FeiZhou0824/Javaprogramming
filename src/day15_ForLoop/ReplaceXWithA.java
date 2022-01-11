package day15_ForLoop;

import java.util.Scanner;

public class ReplaceXWithA {

    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();
        if(word.charAt(0) == 'x'){
           word = word.replaceFirst("x","a");
        }
        System.out.println(word);
        input.close();



    }
}
