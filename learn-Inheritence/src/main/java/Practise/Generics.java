package Practise;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static <T extends Number> void project(List<T> list){
        for(T element:list){
            if(element.intValue()%2!=0)
            System.out.println(element);
        }
    }

    public static <T> void main(String[] args) {
        List <Integer>list =new ArrayList<>();
       list.add(25);
       list.add(96);
       list.add(97);
       project(list);




    }
}