package org.streams_Practise;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class DifferentWaysTouseStream {



    public static void main(String[] args) {


//        List<Integer> list= Arrays.asList(25,2,334,45,667,87,23);
//        List<Integer>element=list.stream().filter(n->n>20).sorted().collect(Collectors.toList());
//        element.forEach(System.out::println);


        List<Customer> customer=new LinkedList<>();
        customer.add(new Customer(1,"ashish",24534.09,"D-MArt"));
        customer.add(new Customer(2,"rohith",10634.09,"pvr"));
        customer.add(new Customer(7,"rahul",2.09,"walmart"));
        customer.add(new Customer(8,"abhay",24534.09,"apple store"));
        customer.add(new Customer(4,"umair",245.09,"orian"));
        customer.add(new Customer(2,"rohith",10634.09,"pvr"));
        customer.add(new Customer(7,"rahul",2.09,"walmart"));

        //count example
        long a=customer.stream().filter(number->number.getPrice()>3000).count();
        System.out.println(a);

        //distinct


    }

}