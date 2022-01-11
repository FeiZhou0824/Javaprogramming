package day17_While_DoWhile;

import jdk.swing.interop.SwingInterOpUtils;

public class BranchingStatement2 {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {
            if (i == 'C') {
                continue;
            }

            System.out.println(i);

        }
        System.out.println("-------------------------------------");
        // print all the even number 1~10

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) { //1.3.5.7.9
                continue;//skip
            }
            System.out.println(i); //2.4.6.8.10

        }


        System.out.println("-----------------------------------------");
        //print all the odd number between 1~10

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);


        }
    }
}
