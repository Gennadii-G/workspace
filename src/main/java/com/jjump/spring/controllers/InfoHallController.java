package com.jjump.spring.controllers;


import com.jjump.spring.abstr.layout.TrampolineHallService;
import com.jjump.spring.domain.TrampolineHall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/infohall")
public class InfoHallController {
    TrampolineHallService hallDao;

    @Autowired
    public InfoHallController(TrampolineHallService hallDao) {
        this.hallDao = hallDao;
    }

    @RequestMapping(value = "/{hallid}", method = RequestMethod.GET)
    public String getInformationHall(Model model, @PathVariable("hallid") String hallid){
        TrampolineHall hall = hallDao.getByName(hallid);
        model.addAttribute("id", hallid);
        model.addAttribute("hall", hall);
        return "infohall";
    }
}
