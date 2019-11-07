package com.call.center.operator.service;

import org.asteriskjava.live.AsteriskServer;
import org.asteriskjava.live.DefaultAsteriskServer;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class AMIConnection {

    private static AsteriskServer instance;

    private AMIConnection(){}

    public static AsteriskServer getInstance(ApplicationArguments args)  {
        if (instance == null){
            AsteriskServer asteriskServer = new DefaultAsteriskServer("localhost", "admin", "elephant");
            asteriskServer.initialize();
            instance = asteriskServer;
        }
        return instance;

    }


}
