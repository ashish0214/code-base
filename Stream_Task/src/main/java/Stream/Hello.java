package Stream;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Hello {

    public static void main(String[] args) {

//         Predicate<String> p=s->s.startsWith("a");
//        List<String> list= Arrays.asList("ashish","abhay","rohith","Manish");
//        list.stream().filter(p).forEach(System.out::println);
//
     List<List<Integer>> list1 = Arrays.asList(Arrays.asList(1, 2, 3, 4), Arrays.asList(2, 44, 44, 55, 2));
//        Map<String, List<Integer>> l = list1.stream().flatMap(x -> x.stream()).collect(Collectors.groupingBy(x -> {
//            if (x % 2 == 0) {
//                return "Even";
//            } else {
//                return "Odd";
//            }
//        }
//    ));S
//        System.out.println(l);
//       Optional<Integer> ans = list1.stream().flatMap(x->x.stream()).filter(x->x%2==0).findAny();
//       if(ans.isPresent()){
//        System.out.println(ans.get());}
//
//       ans.ifPresentOrElse(x-> System.out.println(x+"Ans"),()-> System.out.println("Default"));
//
//       Optional<Integer>maxMarks=list1.stream().flatMap(x->x.stream()).sorted().filter(x->x%2==0).max((a,b)->b-a);
//        System.out.println(maxMarks.get());


        //optional

//        EmployeeAddition employeeAddition = new EmployeeAddition();
//        List<Employee> emp=employeeAddition.addEmployee();
//
//        System.out.println(Optional.empty());
//
//        for(Employee em:emp) {
//            Optional<String>opt=Optional.ofNullable(em.getGender());
////            opt.ifPresentOrElse(x-> System.out.println(x),()-> System.out.println("defult"));
////
////            if(opt.isPresent()){
////                System.out.println(opt.get());
////            }
//
//            String s=opt.orElse("Default");
//            System.out.println(s);
//
//            opt.orElseThrow(()->new NullPointerException("null value present"));


        ArrayList<String> str=new ArrayList<>();
        str.add("Ashish");
        str.add("Demo");
        str.add("Rahul");
        str.add("Don");
        str.add("Manish");
        str.add("");
        str.add("");
        str.stream().filter(x->x.startsWith("D")).forEach(System.out::println);












}
}
