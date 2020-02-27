package com.sunforits.jiaocaizhengding.controller;

import com.sun.org.apache.xml.internal.utils.XMLStringDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouterController {
    @RequestMapping(value = {"/"})
    public String defaultPage() {
        return "index";
    }
}
