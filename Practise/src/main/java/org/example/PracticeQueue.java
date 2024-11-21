package org.example;

import java.util.PriorityQueue;

public class PracticeQueue {
    public static void main(String[] args) {
        PriorityQueue a=new PriorityQueue();
        a.add(1);
        a.add(6);
        a.add(2);
        a.add(9);
        a.add(3);
        System.out.println(a);
        System.out.println(a.poll());
        System.out.println(a);
        System.out.println(a.poll());
        System.out.println(a);
        System.out.println(a.poll());
    }
}
