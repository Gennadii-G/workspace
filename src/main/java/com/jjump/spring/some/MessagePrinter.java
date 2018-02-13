package com.jjump.spring.some;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    final private MesService service;

    @Autowired
    public MessagePrinter(MesService mesService){
        this.service = mesService;
    }

    public void printMes(){
        System.out.println(this.service.getMessage());
    }
}
