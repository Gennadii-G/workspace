package com.jjump.spring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/info/hall")
public class InfoHallController {

    public String getInformationHall(ModelMap model){
        String info =
        model.addAttribute("info");
        return "infohall";
    }
}
