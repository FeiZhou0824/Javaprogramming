package day15_ForLoop;

public class StringMethods {

    public static void main(String[] args) {

        String str = "  ";
        boolean r = str.isEmpty();
        System.out.println("r = " + r);

        boolean r1 =str.isBlank();
        System.out.println("r1 = " + r1);

        String str2 = "Cydeo     ";
        System.out.println(str2.isBlank());

        System.out.println("----------------------------");
        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        //yes, Yes,YEs,yES

        System.out.println("yes".equalsIgnoreCase("YEs"));

        System.out.println("-------------------------------------");

        String sentence = "My favorite programming language is JAVA";

        boolean hasCsharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("JAVA");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");// ingore case sensitivity

        System.out.println(hasCsharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);
        System.out.println("-----------------------------------");

        String input1 = "I love jAvA";
        String input2 ="Java";

        System.out.println(input1.equals(input2));//false
        System.out.println(input1.equalsIgnoreCase(input2));//false

        System.out.println(input1.contains("Java"));//true
        System.out.println(input1.toLowerCase().contains("java")); // case sensitivety
        System.out.println(input1.toUpperCase().contains("JAVA"));//


        System.out.println("------------------------------------");

        String a = "Wooden Spoon";
        boolean x = a.startsWith("Woo");
        boolean x1 = a.startsWith("oo");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().startsWith("wooden"); //大小写。全部变成小写，或者大写，然后再.startWith

        System.out.println("x = " + x);
        System.out.println("x1 = " + x1);
        System.out.println("y = " + y);
        System.out.println("z = " + z);










    }
}
