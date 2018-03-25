package com.jjump.spring.domain;

import java.util.Date;

public class User extends DomainObject {
    private int id;
    private String firstName;
    private String secondName;
    private String lastName;
    private Contact contact;
    private boolean isAdult;
    private Date birthday;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
