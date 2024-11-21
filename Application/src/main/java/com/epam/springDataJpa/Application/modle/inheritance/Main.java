package com.epam.springDataJpa.Application.modle.inheritance;

import org.springframework.stereotype.Component;

@Component
public class Main {
    public static void test() {
        // Using the builder for the parent class
        Parent parent = Parent.builder()
                .parentField("Parent Value")
                .build();

        // Using the builder for the child class
        Child child = Child.builder()
                .parentField("Parent Value")
                .childField("Child Value")
                .build();

        // Display the values
        System.out.println("Parent Field: " + parent.getParentField());
        System.out.println("Child Fields: " + child.getParentField() + ", " + child.getChildField());
    }
}

