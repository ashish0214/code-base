package org.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static final String MANGALORE = "mangalore";

    public static void main(String[] args) {
        Map<String,Integer> data=new HashMap<>();
        data.put("bangalore",364746);
        data.put("delhi",567878);
        data.put(MANGALORE,67878);
        System.out.println(data);
        data.remove("bangalore");
        for(Map.Entry<String,Integer> entry:data.entrySet()){
            System.out.println(String.format("the key is %s and value is %d",entry.getKey(),entry.getValue()));
        }
        data.forEach((K,V)-> System.out.println(K+" "+V));
        System.out.println(data.get("mangalore"));
    }
}
