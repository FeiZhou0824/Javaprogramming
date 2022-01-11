package day25_CustomMethod_Overloading;

public class SumOfNumbers {

    public static void main(String[] args) {

        int a =5, b=6,c=5,d=9;
        int sum =sumOf2Numbers(a,b);
        System.out.println(sum);
        int sum2 = sumOf3Numbers(a,b,c);
        System.out.println(sum2);

       int sum3= sumOf4Numbers(a,b,c,d);
        System.out.println(sum3);


    }

    public  static  int sumOf2Numbers(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }

    public static int sumOf3Numbers(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    public static int sumOf4Numbers(int num1, int num2, int num3,int num4){
        return num1+num2+num3+num4;
    }



}
/*
Task1:
        1. create a method that can find the sum of two numbers
                        method name: sumOf2Numbers

        2. create a method that can find the sum of three numbers
                        method name: sumOf3Numbers

        3. create a method that can find the sum of four numbers
                        method name: sumOf4Numbers
 */