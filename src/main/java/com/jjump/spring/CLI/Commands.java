package com.jjump.spring.CLI;

import com.jjump.spring.abstr.layout.TrampolineHallService;
import com.jjump.spring.abstr.layout.UserService;
import com.jjump.spring.adapter.console.TrampolineHallAdapter;
import com.jjump.spring.domain.TrampolineHall;
import com.jjump.spring.domain.User;
import com.jjump.spring.inmemdb.DataHall;
import com.jjump.spring.services.Shower;
import org.springframework.context.ApplicationContext;
import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliAvailabilityIndicator;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.shell.core.annotation.CliOption;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@Component
public class Commands implements CommandMarker {
    private static ApplicationContext context;
    private User currentUser;

    @CliAvailabilityIndicator({"out", "show-halls", "show-hall"})
    public boolean isLogin(){
        return currentUser != null;
    }

    @CliCommand(value = "test", help = "god will help you")
    public String doTest() {
        return "[ TEST - OK ]";
    }

    @CliCommand(value = "login")
    public String login(@CliOption(key="name", mandatory=true)String login){
        List<User> user = context.getBean(UserService.class).getAll()
                .stream().filter(u -> u.getFirstName().equals(login)).collect(Collectors.toList());
        if(user.isEmpty()){
            return "user wasn't found";
        }else {
            currentUser = user.get(0);
            return "login success";
        }
    }

    @CliCommand(value = "order")
    public String order(@CliOption(key="hall-name", mandatory=true)String hallName){
        Set<TrampolineHall> halls = context.getBean(TrampolineHallService.class).getByName(hallName);
        if(halls.isEmpty()){
            return "error";
        }else{
            return halls.iterator().next().orderTramp() ? "trampoline was ordered" : "not enough free trampolines";
        }
    }

    @CliCommand(value = "out")
    public String logout(){
        currentUser = null;
        return "you did logout";
    }

    @CliCommand(value = "show-halls")
    public String showAllHalls(){
//        return context.getBean(TrampolineHallAdapter.class).getAllHallsAsString();
        Set<TrampolineHall> halls = context.getBean(TrampolineHallService.class).getAll();
        StringBuffer res = new StringBuffer();
        halls.stream().forEach(h -> res.append(h.toString() + "\n"));
        return res.toString();

    }

    @CliCommand(value = "show-hall")
    public String showAllHallsByName(@CliOption(key="name", mandatory=true) String name){
        Set<TrampolineHall> halls = context.getBean(TrampolineHallService.class).getByName(name);
        StringBuffer res = new StringBuffer();
        halls.stream().forEach(h -> res.append(h.toString() + "\n"));
        return res.toString();
    }

    public static void setContext(ApplicationContext context) {
        Commands.context = context;
    }
}
