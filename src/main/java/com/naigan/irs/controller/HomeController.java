package com.naigan.irs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    public ModelAndView getHomeDetails(){
        return new ModelAndView("infyGoHome","","");
    }
}
