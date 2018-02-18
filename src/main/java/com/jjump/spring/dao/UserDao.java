package com.jjump.spring.dao;

import com.jjump.spring.abstr.layout.UserService;
import com.jjump.spring.domain.TrampolineHall;
import com.jjump.spring.domain.User;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class UserDao implements UserService {

    private List<User> users;
    private PropertiesConfiguration props;
    private int userAmount;

    public UserDao() throws ConfigurationException {
        props = new PropertiesConfiguration("vata.properties");;
        userAmount = props.getInt("users.amount");
    }

    @Override
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        for(int i=1; i<userAmount+1; i++){
            User user = new User();
            user.setId(i);
            user.setFirstName(props.getString(i + ".user.name"));
            users.add(user);
        }
        return users;
    }

    @Override
    public User getByName(String name) {
        User res = getAll().stream().filter(u -> u.getFirstName().equals(name)).collect(Collectors.toList()).get(0);
        return res;
    }
}
