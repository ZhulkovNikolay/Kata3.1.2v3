package com.kata.kata312v3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private Long id;
    private String firstName;
    private String lastName;

}
