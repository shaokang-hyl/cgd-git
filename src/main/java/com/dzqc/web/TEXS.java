package com.dzqc.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TEXS {
    @GetMapping("/GH")
    public String GH(Model model){

        model.addAttribute("DDDD","你好哈");
        model.addAttribute("DDDDSS","你好哈");
        return "GH";
    }
}
