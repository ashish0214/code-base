package com.epam.springDataJpa.Application.modle.inheritance;

import lombok.Getter;
import lombok.experimental.SuperBuilder;
import org.springframework.stereotype.Component;

@Getter
@SuperBuilder
public class Parent {
    private final String parentField;

}
