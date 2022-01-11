package day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {

        String []names = {"Cydeo School","Wooden Spoon","Java Programming", "SQL Programming", "Selenuim Automation","API Testing", "Database Testing"};

        for (String eachName :names){
            System.out.println(eachName);

            String initial = eachName.charAt(0)+"."+ eachName.charAt(eachName.indexOf(" ")+1);
            System.out.println(initial);
        }


    }
}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */