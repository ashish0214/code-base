package collection.queue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> element=new PriorityQueue<>();
        //is the queue is full if we try to add the element then it will not throw exception but returns false
        element.offer("ashish");

        //add will throw exception if it queue is full
        element.add("rohith");

        System.out.println(element.poll());

        //poll removes the first elemnt from the queue
        System.out.println(element.poll());

        //if there is no element also it will not through exception but provides null value
        System.out.println(element.poll());

        //if there is no element present it will return exception
        System.out.println(element.remove());

    }
}
