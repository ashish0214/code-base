package threads.ThreadUsingExecuters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demo {


public static void main(String[] args) {
        Employee emp1=new Employee("John",25,30,1000);
        Employee emp2=new Employee("Doe",30,30,2000);
        Employee emp3=new Employee("Smith",35,30,3000);
        Employee emp4=new Employee("Tom",40,30,4000);
        Employee emp5=new Employee("Jerry",45,30,5000);

        List<Employee> empList=new ArrayList<>(Arrays.asList(emp1,emp2,emp3,emp4,emp5));
    ExecutorService ex= Executors.newFixedThreadPool(5);
        for(Employee emp:empList){
            EmployeSalary es=new EmployeSalary(emp);
            ex.submit(es);

        }
        ex.shutdown();

        for (Employee employee:empList){
            System.out.println(employee);
        }
        }
}
