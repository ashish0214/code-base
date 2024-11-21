package collection.List;

import collection.comparable.Employee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListProblem {
    public static void main(String[] args) {
        List<Employee> listOfEmployee = new LinkedList<>();
        listOfEmployee.add(new Employee(1, "ashish", 34));
        listOfEmployee.add(new Employee(2, "manish", 45));
        listOfEmployee.add(new Employee(3, "rahul", 99));
        listOfEmployee.add(new Employee(4, "bhanu", 44));


        //ArrayList methods

        System.out.println(listOfEmployee.get(2));

        System.out.println(listOfEmployee.set(3,new Employee(1,"rana",23)));

        listOfEmployee.add(3,new Employee(10,"god",67));





        //remove based on index
        listOfEmployee.remove(1);

        //size
        System.out.println(listOfEmployee.size());

        System.out.println(listOfEmployee.isEmpty());

        for (Employee emp : listOfEmployee) {
            System.out.println(emp);
        }
        listOfEmployee.clear();



    }
}
