package com.stdlabel.spring_project.course_project.contoller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping(value = "/")
    public String helloWorld(Model model) {
        model.addAttribute("text", "Hello world");
        return "home";
    }


}
