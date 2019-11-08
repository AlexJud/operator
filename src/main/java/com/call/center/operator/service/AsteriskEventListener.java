package com.call.center.operator.service;

import org.asteriskjava.manager.AuthenticationFailedException;
import org.asteriskjava.manager.ManagerEventListener;
import org.asteriskjava.manager.TimeoutException;
import org.asteriskjava.manager.action.StatusAction;
import org.asteriskjava.manager.event.ManagerEvent;

import java.io.IOException;

public class AsteriskEventListener implements ManagerEventListener {

    public void run() {
        try {
            AMIConnection.getInstance().addEventListener(this);
            AMIConnection.getInstance().login();
            AMIConnection.getInstance().sendAction(new StatusAction());
            Thread.sleep(60000);
            AMIConnection.getInstance().logoff();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (AuthenticationFailedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void onManagerEvent(ManagerEvent event)
    {
        // just print received events
        System.out.println("EVENT " +event.getCallerIdName());
        System.out.println("EVENT 2" +event.getCallerIdNum());
    }
}
