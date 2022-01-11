package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        // username : "Cydeo"
        //password: "Cydeo123"

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");

        String username = input.next();
        System.out.println("Enter your password:");
        String password = input.next();


        if (username.equalsIgnoreCase("Cydeo") && password.equals("Cydeo123")) {

            System.out.println("Logged in");

        } else {
            int attempts = 3;
            while (!(username.equalsIgnoreCase("Cydeo") && password.equals("Cydeo123")) && attempts > 0) {
                if(attempts ==1){
                    System.out.println("THIS IS YOUR LAST CHANCE");
                }
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username:");
                username = input.next();
                System.out.println("Enter your password:");
                password = input.next();
                attempts--;
            }
        }
        if (username.equalsIgnoreCase("Cydeo") && password.equals("Cydeo123")) {

            System.out.println("Logged in");
        } else {
            System.out.println("Your account is locked");
        }

        input.close();
    }

}
/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is lucked."
 */
