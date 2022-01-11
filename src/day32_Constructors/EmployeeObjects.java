package day32_Constructors;

import javax.lang.model.SourceVersion;
import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Aaron");

        Employee employee2 = new Employee("Aaron", 'M');

        Employee employee3 = new Employee("Fei", 'F',"SDET");




        System.out.println("employee1 = " + employee1);
        System.out.println("employee2 = " + employee2);
        System.out.println("employee3 = " + employee3);





    }



}
