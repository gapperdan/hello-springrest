package com.gapperdan.hellospringrest.domain;

import lombok.Data;

import java.io.Serializable;

public @Data
class Person implements Serializable {

    private static final long serialVersionUID = 2162238237648537570L;
    private String firstName;
    private String lastName;
    private int age;
    private String uid;
}
