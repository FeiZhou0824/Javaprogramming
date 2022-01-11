package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {


    public static void main(String[] args) {


        System.out.println("------------------------------------------------");



String sentence = "Wooden Spoon";
String [] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("-------------------------------------------");

        String email = "WoodenSpoon@Cydeo.com";

       String []arr= email.split("@");
        System.out.println(Arrays.toString(arr));

        System.out.println("--------------------------------------");

        String s ="Today is nice day. today is monday. today we leared java";
        String [] sentences = s.split("\\. ");

        System.out.println(Arrays.toString(sentences));









    }
}
