package cn.sz.lb.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
@FeignClient(name = "provideserver")
public interface GetShow {
    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public String showMe();
}
