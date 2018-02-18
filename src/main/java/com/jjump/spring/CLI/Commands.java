package com.jjump.spring.CLI;

import com.jjump.spring.inmemdb.DataHall;
import com.jjump.spring.services.Shower;
import org.springframework.context.ApplicationContext;
import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliAvailabilityIndicator;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.stereotype.Component;


@Component
public class Commands implements CommandMarker {
    private static ApplicationContext context;

    @CliCommand(value = "test", help = "god will help you")
    public String doTest() {
        return "[ TEST - OK ]";
    }

    @CliCommand(value = "show")
    public String showAllHalls(){
        return context.getBean(Shower.class).showAllHallsInfo();
    }

    public static void setContext(ApplicationContext context) {
        Commands.context = context;
    }
}
