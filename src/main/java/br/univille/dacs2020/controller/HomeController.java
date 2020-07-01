package br.univille.dacs2020.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/")
@Controller
public class HomeController {
    
    @GetMapping("")
    public ModelAndView index(){
        Date data = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY - HH:MM");
        String agora = sdf.format(data);
        return new ModelAndView("home/index", "now", agora);
    }
}