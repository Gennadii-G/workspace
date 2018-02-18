package com.jjump.spring.domain;

import java.util.Date;

public class Order  extends DomainObject {

    private int price;
    private Contact consumer;
    private int timeAmount;
    private Date date;
}
