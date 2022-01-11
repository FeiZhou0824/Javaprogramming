package day15_ForLoop;

public class FormatFullName {

    public static void main(String[] args) {

        String firstName = "cyDEo",
                lastName = "SCHOOL";

      // firstName=  firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toLowerCase(); 第一种方法
       // System.out.println("firstName = " + firstName);

        //第二种方法

        firstName = ("" + firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1)+lastName.substring(1).toLowerCase();

        String fullName = firstName + " " +lastName;
        System.out.println("fullName = " + fullName);
    }
}
