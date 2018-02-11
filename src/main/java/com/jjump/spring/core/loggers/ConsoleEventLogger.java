package com.jjump.spring.core.loggers;


import com.jjump.spring.core.beans.Event;

public class ConsoleEventLogger implements EventLogger {

    public void logEvent(Event event){
        System.out.println(event.toString());
    }
}
