package day15_ForLoop;

import java.util.Scanner;

public class ValidGmail {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a email account");


        String email = input.next();
        String result ="";
               boolean gmail =email.toLowerCase().endsWith("@gmail.com");
               if(gmail == true){
                   result = "Gmail Account";
               }else{
                   result="Not gmail account";
               }
        System.out.println(result);
               input.close();


    }


}
