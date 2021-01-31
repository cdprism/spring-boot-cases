package org.shancm.redisdemo.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private String name;
    private String age;

    public User(){
        this.name="Jerry";
        this.age="10";
    }
}
