package cn.sz.lb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Show {
    @RequestMapping(value = "/show",method = RequestMethod.GET)
    @ResponseBody
    public String show(){
        System.out.println("提供者的show");
        return "say hello";
    }
}
