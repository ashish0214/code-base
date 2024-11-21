package org.example;

import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(35);
        list.add(45);
        list.add(49);
        list.add(9);
//        System.out.println(list.get(2));
//       Iterator it =list.iterator();
//       while(it.hasNext()){
//           System.out.println(it.next());
//       }
//       for(Integer i: list){
//           System.out.println(i);
//       }
//
//        System.out.println(list.get(1));
//        list.set(2,4);

        Collections.sort(list);
        for(Integer i:list){
            System.out.println(i);
        }
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.contains(25));
        Collections.reverse(list);

        String str = new String("ASHISH");



    }
}