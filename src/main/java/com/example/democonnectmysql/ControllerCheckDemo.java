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
//        Person person1 = new Person(1,"Duong","IT1",1);
//        Person person2 = new Person(2,"Duong2","IT2",2);
//        Person person3 = new Person(3,"Duong2","IT3",10);
//        ArrayList<Person> listPersons = new ArrayList<>();
//        listPersons.add(person1);
//        listPersons.add(person2);
//        listPersons.add(person3);
        List<Person> listPersonx = hibernateConection.getAllIlike();

        model.addAttribute("listPersons",listPersonx);
        return "index";
    }
}
