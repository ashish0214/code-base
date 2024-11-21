package stream.grouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByDepartment {
    public static void main(String[] args) {
        List<Employe> empList = Arrays.asList(new Employe(1,"ashish","java developer",35000),
                new Employe(2,"rohith","hr",33000),
                new Employe(1,"bhau","contract",23000),
                new Employe(1,"manish","java developer",20000),
                new Employe(1,"abhay","hr",10000),
                new Employe(1,"umar","java developer",50000),
                new Employe(1,"shailesh","contract",60000));

//        Map<String,List<Employe>> groupBydepartmentemp=empList.stream().collect(Collectors.groupingBy( Employe::getDepartment));
//        for (Map.Entry department: groupBydepartmentemp.entrySet()){
//            System.out.println("the department is"+department.getKey());
//            System.out.println("the employees are "+department.getValue());
//          }
//
//        List<String> ele=empList.stream().filter(employee->employee.getSalary()>45).map(ele1->ele1.getName()).toList();
//        System.out.println(ele);

        //practise
        System.out.println(empList.stream().allMatch(x->x.getSalary()>1000));
        System.out.println(empList.stream().anyMatch(x->x.getSalary()>210000));

        //exmaple of iterate
        Stream.iterate(200,x->x+2).limit(10).forEach(x->System.out.println(x));

        empList.stream().map(x->x.getName()).forEach(System.out::println);

        //example of flatmap
        int [][]element={{2,3,4},{56,8,8},{5,7,9}};
        Arrays.stream(element).flatMapToInt(x->Arrays.stream(x)).distinct().sorted().skip(6).forEach(System.out::println);

        Long count=empList.stream().count();
        System.out.println(count);

//Suppose you have a list of strings representing numbers,
// and you want to find the square of the sum of the even numbers.
List<String> numberStrings = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");

int total_sum=numberStrings.stream().mapToInt(x->Integer.parseInt(x)).filter(x->x%2==0).sum();


    }
}
