package com.kodilla.spring.basic.spring_dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SimpleApplication {

    @Autowired
    @Qualifier(value = "SkypeMessageService")
            private MessageService messageService;

//    public SimpleApplication(MessageService messageService) { // tutaj konstruktor nie jest potrzebny
//        this.messageService = messageService;
//    }

    public String processMessage(String message, String receiver) {
        if (checkReceiver(receiver)) {
            return this.messageService.send(message, receiver);
        }
        return null;
    }

    private boolean checkReceiver(String receiver) {
        return receiver != null && !receiver.isEmpty();
    }
}

//    @Autowired
//    public void setMessageService(SkypeMessageService messageService) {
//        this.messageService = messageService;
//    }