package com.soma.springbootmongodb.document;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Users {

    private Integer id;
    private String name;
    private String teamName;
    private Long salary;
}
