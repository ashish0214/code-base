package collection.comparator;

import collection.comparable.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


//its not correct
public class Main {
    public static void main(String[] args) {
        List<Employee>arr =Arrays.asList(new collection.comparable.Employee(1, "ashish", 34),
                new collection.comparable.Employee(2, "rohith", 30),
                new Employee(3, "bhanu", 78));

        Collections.sort(arr,new Example());


        //if you are storing employee details in list then we can use Collections.sort();
        for (Employee emp:arr){
            System.out.println(emp);
        }
    }
}
