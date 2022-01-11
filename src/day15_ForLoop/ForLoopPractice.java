package day15_ForLoop;

import jdk.swing.interop.SwingInterOpUtils;

public class ForLoopPractice {

    public static void main(String[] args) {

        // 15 16 17 18......45
        for(int i= 15; i<=45; i++  ){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Hello");

        System.out.println("------------------------");
        //100 99 98 98...................50

        for(int i = 100; i>=50; i--){
            System.out.print(i+ " ");

    }
        System.out.println();
        System.out.println("-----------------------------");
        //print all the even number between 1-55

        for(int i = 1; i<=55; i++){ //第一种方法
            if (i%2==0){
                System.out.print(i +" ");
            }
        }
        System.out.println();
        System.out.println("--------------------------------");
        //print all the even number between 1-55
        for(int i = 2; i <= 54 ; i += 2){
            System.out.print( i +" ");
        }






    }
}
