package com.acme.edu.typeofmessages;

import com.acme.edu.messagehandlers.Accomulator;
import com.acme.edu.messagehandlers.Decorator;

/**
 * @author Kulakova
 */
 public class StringTypeMessage extends Command implements Decorator, Accomulator {

     private String message;

     public StringTypeMessage(String message){
         this.message=message;
     }

    @Override
    public boolean accumulate() {
        return false;
    }

    @Override
    public String decorate() {
        return null;
    }


}