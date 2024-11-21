package stream.employeeProblems;

import org.hibernate.sql.ast.tree.expression.Summarization;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


        //  1 .How many male and female employees are there in the organization?
        Map<String, Long> genderCategarisation = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(genderCategarisation);

        //> 2. Print the name of all departments in the organization?

        Set<String> uniqueDepartment = employeeList.stream()
                .map(x -> x.getDepartment()).collect(Collectors.toSet());
        System.out.println(uniqueDepartment);



        //> 3 What is the average age of male and female employees?

        Map<String, Double> averageGenderAge = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
        System.out.println(averageGenderAge);


        //>4  Get the details of highest paid employee in the organization?

        Optional<Employee> highestSal=employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("----");
        System.out.println(highestSal);
        Optional<Employee> highestSalriedEmployee = employeeList
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder())).findFirst();

        System.out.println(highestSalriedEmployee.get());
        //> 5 Get the names of all employees who have joined after 2015?

        List<String> emplyeeJoindedAfter2015 = employeeList.stream().
                filter(x -> x.getYearOfJoining() > 2015).map(x -> x.getName()).toList();
        System.out.println(emplyeeJoindedAfter2015);


        //> 6 Count the number of employees in each department?
        Map<String, Long> eachDepartemntEmpCount = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(eachDepartemntEmpCount);

        //> What is the average salary of each department?
        Map<String, Double> averageDepartemtSalary = employeeList.stream().collect(Collectors.
                groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(averageDepartemtSalary);


        //Get the details of youngest male employee in the product development department?
        Optional<Employee> youngestEmployee = employeeList
                .stream().filter(x -> x.getDepartment().equals("Product Development"))
                .sorted(Comparator.comparing(Employee::getAge)).findFirst();
        System.out.println(youngestEmployee.get());


        //Who has the most working experience in the organization?

        Optional<Employee> mostExperienceEmployee = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getYearOfJoining))
                .findFirst();
        System.out.println(mostExperienceEmployee.get());


        //> How many male and female employees are there in the sales and marketing team?


        Map<String, Long> maleAndFemaleCount = employeeList.stream().filter(x -> x.getDepartment().equals("Sales And Marketing"))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(maleAndFemaleCount);


        //> What is the average salary of male and female employees?

        Map<String, Double> salaryByGender = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(salaryByGender);


        //> List down the names of all employees in each department?
        Map<String, List<String>> employeeByDepartment = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(employeeByDepartment);


        //> What is the average salary and total salary of the whole organization?

        //sumarizingDouble is used when we want the total,average,max,min,count
        DoubleSummaryStatistics empSal = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("The average salary of the organistation" + empSal.getAverage());
        System.out.println("the total salary of the org" + empSal.getSum());

        //> Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years?

        Map<Boolean, List<String>> groupByAge = employeeList.stream()
                .collect(Collectors.partitioningBy(x -> x.getAge() > 25, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(groupByAge);


        //> Who is the oldest employee in the organization? What is his age and which department he belongs to?
        Optional<Employee> oldestEmp = employeeList.stream().max(Comparator.comparing(Employee::getAge));

        System.out.println(oldestEmp);

    }
}
