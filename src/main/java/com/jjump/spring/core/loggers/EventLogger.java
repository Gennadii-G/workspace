package com.jjump.spring.core.loggers;

import com.jjump.spring.core.beans.Event;

public interface EventLogger {

    public void logEvent(Event event);

}