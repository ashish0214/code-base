package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(25,3,44,4,2,3,6,7,87,9,7);
        for(int i=0;i<list.size();i++){
            int lowest=list.get(i);
            int index=0;
            for(int j=i+1;j<list.size();j++){
                if(lowest>list.get(j)){
                    lowest=list.get(j);
                    index=j;

                }
            }
            int temp=list.get(i);
            list.set(i,lowest);
            list.set(index,temp);
        }

        System.out.println(list);

        
    }
}
