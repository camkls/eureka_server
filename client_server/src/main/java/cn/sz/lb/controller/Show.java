package cn.sz.lb.controller;

import cn.sz.lb.feignClient.GetShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Show {
    @Autowired
    private GetShow getShow;

    @RequestMapping(value = "showMe",method = RequestMethod.GET)
    @ResponseBody
    public String showMe(){
        System.out.println("使用者的show");
        return getShow.showMe();
    }
}
