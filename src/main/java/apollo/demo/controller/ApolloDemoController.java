package apollo.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Sfy
 * @Date: 2020/6/30 0030 16:14
 */
@RestController
public class ApolloDemoController {


    @Value("${timeout:2}")
    private String timeOut;

    @Value("${user:1}")
    private String user;


    @RequestMapping("/getTimeOut")
    public String getTimeOut(){
        return timeOut;
    }

    @RequestMapping("/getUser")
    public String getUser(){
        return user;
    }

    @RequestMapping("/getDemo")
    public String getDemo(){
        return "demo";
    }
}
