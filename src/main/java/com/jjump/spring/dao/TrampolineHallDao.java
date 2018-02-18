package com.jjump.spring.dao;


import com.jjump.spring.abstr.layout.TrampolineHallService;
import com.jjump.spring.domain.Trampoline;
import com.jjump.spring.domain.TrampolineHall;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class TrampolineHallDao implements TrampolineHallService {

    private PropertiesConfiguration props;
    private int hallsAmount;
    private int trampsAmount;

    public TrampolineHallDao() throws ConfigurationException {
        props = new PropertiesConfiguration("vata.properties");
    }

    @Override
    public Set<TrampolineHall> getAll() {
        return selectAllTrampolineHall();
    }

    @Override
    public Set<TrampolineHall> getByName(String name) {
        return selectAllTrampolineHall().stream().filter(h -> h.getName().equals(name)).collect(Collectors.toSet());
    }

    //    @PostConstruct
    private Set<TrampolineHall> selectAllTrampolineHall(){
        hallsAmount = props.getInt("halls.amount");
        Set<TrampolineHall> res = new HashSet<>();

        for(int i=1; i < hallsAmount+1; i++){
            trampsAmount = props.getInt(i + ".hall.trampoline.amount");
            TrampolineHall tHall = new TrampolineHall();
            tHall.setName(props.getString(i + ".hall.name"));
            tHall.setPrice(props.getInt(i + ".hall.price"));
            tHall.setTramlins(loadTrompalines());
            res.add(tHall);
        }
        return res;
    }

    private List<Trampoline> loadTrompalines(){
            List<Trampoline> tramps = new ArrayList<>();
        while (tramps.size() < trampsAmount+1){
            tramps.add(new Trampoline());
        }
        return tramps;
    }
}
