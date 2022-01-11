package day21_ForEachLoop;

public class ReverseNames {

    public static void main(String[] args) {

        String []names = {"Cydeo School","Wooden Spoon","Java Programming", "SQL Programming", "Selenuim Automation","API Testing", "Database Testing"};

        for (String eachName : names) {
            //System.out.println(eachName);

            String reversed = "";
            for (int i = eachName.length()-1; i >=0 ; i--) {
                char ch = eachName.charAt(i);
                reversed =reversed+ch;
            }
            System.out.println(reversed);
        }





    }
}
