package task;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> studentDetails=new ArrayList<>();
        studentDetails.add(new Student(1,"John",Arrays.asList(20,30,40,40,33,33)));
        studentDetails.add(new Student(2,"rohith",Arrays.asList(99,34,55,50,60,70)));
        studentDetails.add(new Student(3,"ashish",Arrays.asList(20,30,40,50,60,70)));
        studentDetails.add(new Student(4,"bhanu",Arrays.asList(33,88,40,66,77,70)));
        studentDetails.add(new Student(5,"manish",Arrays.asList(44,70,40,22,60,77)));
        studentDetails.add(new Student(6,"piyush",Arrays.asList(20,55,40,50,60,70)));
        studentDetails.add(new Student(7,"ananya",Arrays.asList(20,30,40,50,60,70)));
        studentDetails.add(new Student(8,"annu",Arrays.asList(20,30,40,50,60,70)));
        studentDetails.add(new Student(9,"surya",Arrays.asList(11,55,66,5990,99,70)));
        studentDetails.add(new Student(10,"abhay",Arrays.asList(55,77,40,77,60,70)));
        studentDetails.add(new Student(11,"aayush",Arrays.asList(20,30,22,50,66,70)));
        studentDetails.add(new Student(12,"sam",Arrays.asList(33,30,40,50,60,70)));
        studentDetails.add(new Student(13,"samson",Arrays.asList(20,30,0,50,88,70)));


//        Optional<Student> topper=studentDetails.stream().map(Collectors.toMap(Student::getName,student->(student.getMath()+student.getScience()+student.getEnglish()+student.getKannada()+student.getHindi()+student.getSocial())/6)
//                .entrySet().stream().max(Map.Entry.comparingByValue())).map(entry->studentDetails.stream().filter(student->student.getName().equals(entry.getKey())).findFirst()).findFirst();
//
//        System.out.println(topper.get());

//        studentDetails.stream().peek(student->student.setAverage((student.getMath()+student.getScience()+student.getEnglish()+student.getKannada()+student.getHindi()+student.getSocial())/6))
//                .sorted( (s1, s2) -> s2.getAverage() - s1.getAverage()).forEach(System.out::println);

//        studentDetails.stream().collect(Collectors.toMap(Student::getName,Collectors.(ele->ele.)))
    }
}
