package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Ali", "Davod","Ahmed", "Jimmy", "Daniel", "Aaron", "Ahmed","David"));
        employees.retainAll(Arrays.asList("David", "Ahmed"));

        System.out.println(employees);

        System.out.println("---------------------------------");


        String [] names = {"Mary","Monica","Mehray","Musti","Sumeyra","Hasan","Beril"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
        list.removeIf( each -> each.charAt(0) == 'M');

        names = list.toArray(new String [0]);
        System.out.println(Arrays.toString(names));
    }
}
