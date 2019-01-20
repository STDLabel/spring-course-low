package com.stdlabel.spring_project.course_project.contoller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {


    @GetMapping(value = "/")
    public String helloWorld(Model model) {
        model.addAttribute("text", "Hello world");
        return "hello";
    }


}
