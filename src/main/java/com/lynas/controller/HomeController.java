package com.lynas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
import java.util.Objects;

/**
 * Created by LynAs on 6/28/2015.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/ppp", method = RequestMethod.POST)
    public String postM(@RequestParam String name, Map<String, Object> map,Model model) {

        map.put("val", name);
        System.out.println(name);
        model.addAttribute("name", name);
        return "home";
    }
}