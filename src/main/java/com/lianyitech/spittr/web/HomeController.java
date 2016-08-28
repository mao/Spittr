package com.lianyitech.spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by daniyyel on 8/20/16.
 */

@Controller
@RequestMapping({"/","/homepage"})
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String home(){
        return "home";
    }
}
