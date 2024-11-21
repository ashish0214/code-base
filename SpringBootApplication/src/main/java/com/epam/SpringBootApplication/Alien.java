package com.epam.SpringBootApplication;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alien {
    private int id;
    private String name;
    private String technology;


    public void  show(){
        System.out.println("hello Show");
    }
}
