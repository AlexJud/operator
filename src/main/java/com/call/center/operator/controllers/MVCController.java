package com.call.center.operator.controllers;

import com.call.center.operator.service.AMIConnection;
import com.call.center.operator.service.AsteriskEventListener;
import org.asteriskjava.live.AsteriskServer;
import org.asteriskjava.live.DefaultAsteriskServer;
import org.asteriskjava.manager.AuthenticationFailedException;
import org.asteriskjava.manager.TimeoutException;
import org.asteriskjava.manager.action.OriginateAction;
import org.asteriskjava.manager.response.ManagerResponse;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

//@Controller
public class MVCController {


    @GetMapping(value = {"/", "/index"})
    public String index(Model model) {

        model.addAttribute("message", "asdf");
//        run();
//        AsteriskEventListener listener = new AsteriskEventListener();
//        listener.run();

        return "index";
    }

    @GetMapping("/page")
    public String page(Model model) {

        return "page_1";
    }


}


