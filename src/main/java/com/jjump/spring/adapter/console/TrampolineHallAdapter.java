package com.jjump.spring.adapter.console;

import com.jjump.spring.dao.TrampolineHallDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrampolineHallAdapter {

    private TrampolineHallDao halls;

    @Autowired
    public TrampolineHallAdapter(TrampolineHallDao halls) {
        this.halls = halls;
    }

    public String getAllHallsAsString(){
        StringBuffer res = new StringBuffer();
        halls.getAll().stream().forEach(h -> {
            res.append(h.toString() + "\n");
        });
        return res.toString();
    }

    public String getHallbyName(String name){
        StringBuffer res = new StringBuffer();
        halls.getByName(name).stream().forEach( h -> {
            res.append(h.toString() + "\n");
        });
        return res.toString();
    }
}
