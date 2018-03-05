package com.acme.edu.typeofmessages;

import com.acme.edu.messagehandlers.Accomulator;
import com.acme.edu.messagehandlers.Decorator;

public abstract class Command {

    public void handle(Object message){
        if(accumulate()){
            decorate();
        }
    }

    public abstract String decorate();
    public abstract boolean accumulate();

}
