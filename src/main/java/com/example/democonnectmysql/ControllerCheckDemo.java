package com.example.democonnectmysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ControllerCheckDemo {
    @Autowired
    HibernateConection hibernateConection;
    @GetMapping("index")
    public String indexGet(Model model){
        List<Person> listPersonx = hibernateConection.getAllIlike();
        model.addAttribute("listPersons",listPersonx);
        return "index";
    }
}
