package com.example.thymeleafstudy.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/exam")
@Log4j2
public class examController {

    @GetMapping("/view")
    public String example1 (@RequestParam("param1") String param1,
                            Model model) {

        model.addAttribute("model1", "test1");
        model.addAttribute("model2", "test2");
        model.addAttribute("condition", 0);
        return "main-view";
    }
}
