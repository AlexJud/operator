package com.call.center.operator.service;

import org.asteriskjava.live.AsteriskServer;
import org.asteriskjava.live.DefaultAsteriskServer;
import org.asteriskjava.manager.ManagerConnection;
import org.asteriskjava.manager.ManagerConnectionFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class AMIConnection {

    private static ManagerConnection instance;

    private AMIConnection() {
    }

    public static ManagerConnection getInstance() {
        if (instance == null) {
//            AsteriskServer asteriskServer = new DefaultAsteriskServer("localhost", "manager", "pass");
//            asteriskServer.initialize();
            ManagerConnectionFactory factory = new ManagerConnectionFactory("192.168.1.130", "manager", "pass");
            instance = factory.createManagerConnection();
        }
        return instance;

    }


}
