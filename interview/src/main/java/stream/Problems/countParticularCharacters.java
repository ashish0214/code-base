package stream.Problems;


import stream.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class countParticularCharacters {
    public static void main(String[] args) {

        String statement="who is the largest land animal on the planet earth";
        String []words=statement.split(" ");
        Map<String,Long> count =Arrays.stream(words).collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting()));
        System.out.println(count);

//        1. find the number of times the words are repeatring
//        String str="The hjsqajvdghjDBBHHJVhjvxyv";
//        Map<String,Long> count=Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(count);

        //2. find the second largest number

//        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        Optional<Integer> secondLargest=list.stream().sorted((a, b)->b-a).skip(1).findFirst();
//        if(secondLargest.isPresent()){
//            System.out.println("Second Largest Element is: "+secondLargest.get());
//        }

        //3. List<Employees> having 10 employees records.
        //a) Sort list based on the employee's firstName using java8.


        List<Employee> employeeList = Arrays.asList(new Employee(1, "ashish", "rana", "Software"),
                new Employee(2, "rohith", "kumar", "Software"),
                new Employee(3, "manish", "malotra", "hr"),
                new Employee(4, "bhanu", "prakash", "Software"),
                new Employee(5, "subuu", "rana", "hr"),
                new Employee(6, "ananya", "shetty", "hr"),
                new Employee(7, "piyush", "sharma", "Software"),
                new Employee(8, "akhilesh", "rana", "Software"),
                new Employee(9, "annu", "kumar", "hr"),
                new Employee(10, "rohith", "rana", "Software"));
        List<Employee> sortedNames = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getFirstName)
                        .thenComparing(Employee::getLastName)).toList();
        System.out.println(sortedNames);

        Map<Character,Long> nameStartsWith=employeeList.stream().collect(Collectors.groupingBy(x->x.getFirstName().charAt(0),Collectors.counting()));


        for (Map.Entry ele3: nameStartsWith.entrySet()){
            System.out.println(ele3);
        }

        employeeList.stream().collect(Collectors.partitioningBy(x->x.getDepartment().equals("hr"))).entrySet().stream().forEach(System.out::println);

        List<Employee> sortedDepartment=employeeList.stream().sorted(Comparator.comparing(Employee::getDepartment).reversed()).toList();
        System.out.println(sortedDepartment);
    }
}
