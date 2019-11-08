package com.call.center.operator.controllers;

import com.call.center.operator.models.Worker;
import com.call.center.operator.repositories.WorkerRepository;
import com.call.center.operator.service.AMIConnection;
import com.call.center.operator.service.AsteriskEventListener;
import org.asteriskjava.manager.AuthenticationFailedException;
import org.asteriskjava.manager.ManagerConnectionFactory;
import org.asteriskjava.manager.TimeoutException;
import org.asteriskjava.manager.action.OriginateAction;
import org.asteriskjava.manager.response.ManagerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    WorkerRepository repository;

    @GetMapping(value = { "/", "/index" })
    public String index(Model model) {

        model.addAttribute("message", "asdf");
//        run();
        AsteriskEventListener listener = new AsteriskEventListener();
        listener.run();

        return "index";
    }

    @GetMapping("/page")
    public String page(Model model) {
        repository.save(new Worker(null,"Doctor 1"));
        repository.save(new Worker(null,"Doctor 2"));
        repository.save(new Worker(null,"Doctor 3"));
        List<Worker> all = repository.findAll();
        model.addAttribute("workers",all);
        return "page_1";
    }

    private void run(){
        OriginateAction originateAction;
        ManagerResponse managerResponse;

        originateAction = new OriginateAction();
        originateAction.setChannel("SIP/John");
        originateAction.setContext("default");
        originateAction.setExten("300");
        originateAction.setPriority(1);
        originateAction.setTimeout(30000L);

        try {
            AMIConnection.getInstance().login();
            managerResponse = AMIConnection.getInstance().sendAction(originateAction, 30000);
            System.out.println("RESPONCE "+managerResponse.getResponse());
            AMIConnection.getInstance().logoff();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (AuthenticationFailedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }



    }



}


