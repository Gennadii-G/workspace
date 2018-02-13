package com.jjump.spring.CLI;

import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliAvailabilityIndicator;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.stereotype.Component;


@Component
public class Commands implements CommandMarker {

    @CliCommand(value = "test", help = "god will help you")
    public String doTest() {
        return "[ TEST - OK ]";
    }

}
