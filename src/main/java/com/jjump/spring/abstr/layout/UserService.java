package com.jjump.spring.abstr.layout;

import com.jjump.spring.domain.TrampolineHall;
import com.jjump.spring.domain.User;

import java.util.List;
import java.util.Set;

public interface UserService {

    public List<User> getAll();

    public User getByName(String name);
}
