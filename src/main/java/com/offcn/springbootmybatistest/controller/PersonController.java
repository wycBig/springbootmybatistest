package com.offcn.springbootmybatistest.controller;

import com.offcn.springbootmybatistest.eneity.Person;
import com.offcn.springbootmybatistest.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("get")
public class PersonController{

    @Autowired
    private PersonMapper personMapper;

    @GetMapping("/all")
    public String getAll(Model model){
        List<Person> personList = personMapper.getAll();
        System.out.println(personList);
        model.addAttribute("personList",personList);
        return "human";
    }
}
