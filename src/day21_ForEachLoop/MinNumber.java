package day21_ForEachLoop;

public class MinNumber {

    public static void main(String[] args) {

        int [] numbers = {20,5,8,41,30,25};
        int min= numbers[0];

        for (int eachNumber : numbers) {
          //  System.out.println(eachNumber);
            if(eachNumber<min){
                min =eachNumber;
            }
        }

        System.out.println(min);



    }
}
