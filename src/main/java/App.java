package com.jjump.spring.beans;

import com.jjump.spring.core.beans.Client;
import com.jjump.spring.core.beans.Event;
import com.jjump.spring.core.loggers.EventLogger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by N on 11.02.2018.
 */
public class App {

    private Client client;
    private EventLogger eventLogger;

    public App(Client client, EventLogger eventLogger) {
        super();
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public void logEvent(Event event, String msg){
        String message = msg.replaceAll(client.getId(), client.getFullName());
        event.setMsg(message);
        eventLogger.logEvent(event);
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_old.xml");
        App app = context.getBean(App.class);

        Event event = context.getBean(Event.class);
        app.logEvent(event,"some for 1");

        event = context.getBean(Event.class);
        app.logEvent(event,"some for 2");
    }
}
