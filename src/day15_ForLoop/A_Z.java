package day15_ForLoop;

import jdk.swing.interop.SwingInterOpUtils;

public class A_Z {

    public static void main(String[] args) {

        for (char i='A'; i<='Z'; i++ ){
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println("--------------------------------------");
        for (char i ='a'; i<='z'; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------");

        for(char i = 'Z'; i>= 'A'; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("--------------------------------------------");

        for(char i = 'z'; i>='a'; i--){
            System.out.print(i +" ");
        }

        System.out.println();
        System.out.println("------another way to print A~Z-----------------");
        //another way  A~Z ====> 65~90

        for(char i = 65; i <=90; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("------------------------------------------");
        for(char i = 1; i <=40000; i++){
            System.out.print(i+ " ");
        }
    }
}
