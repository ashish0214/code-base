package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void append(List list) {
        list.add("0042");
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        append(intList);
        System.out.println(intList.get(0));
        try{
            int a=1/0;
        }catch(ArrayIndexOutOfBoundsException | NullPointerException|ArithmeticException e1){
            

        }
    }
}