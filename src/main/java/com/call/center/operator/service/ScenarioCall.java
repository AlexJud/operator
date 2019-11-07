package com.call.center.operator.service;

import lombok.Data;
import org.asteriskjava.manager.action.OriginateAction;

public class ScenarioCall  extends OriginateAction {
    private String TRUNK;
    private final String PHONE_FOR_RINGING;
    private final String EXTEN_FOR_APP;
    private final String CONTEXT_FOR_APP;

    public ScenarioCall(String trunk, String phoneForRinging, String extension, String context) {
        this.TRUNK = trunk;
        this.PHONE_FOR_RINGING = phoneForRinging;
        this.EXTEN_FOR_APP = extension;
        this.CONTEXT_FOR_APP = context;
        this.init();
    }

    private void init() {
        //номер абонента
//        String callId = ValidValues.getValidCallId(this.PHONE_FOR_RINGING);
//        //канал с которого звоним
//        String channelAsterisk = ValidValues.getValidChannel(this.TRUNK, this.PHONE_FOR_RINGING);
//        this.setContext(CONTEXT_FOR_APP);
//        this.setExten(EXTEN_FOR_APP);
//        this.setPriority(1);
//        this.setAsync(true);
//        this.setCallerId(callId);
//        this.setChannel(channelAsterisk);
//        log.info("Create Scenario Call: phone '{}',chanel '{}',context '{}',extension '{}'",
//                callId,
//                channelAsterisk,
//                CONTEXT_FOR_APP,
//                EXTEN_FOR_APP);
    }

}
