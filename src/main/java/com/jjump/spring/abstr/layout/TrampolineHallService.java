package com.jjump.spring.abstr.layout;

import com.jjump.spring.domain.TrampolineHall;

import java.util.Set;


public interface TrampolineHallService {

    public Set<TrampolineHall> getAll();

    public TrampolineHall getByName(String name);
}
