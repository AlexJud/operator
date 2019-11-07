package com.call.center.operator.controllers;

import com.call.center.operator.models.Worker;
import com.call.center.operator.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @Autowired
    WorkerRepository repository;

    @GetMapping(value = { "/", "/index" })
    public String index(Model model) {
        model.addAttribute("message", "asdf");
        return "index";
    }

    @GetMapping("/page")
    public String page(Model model) {
        return "page_1";
    }
}
