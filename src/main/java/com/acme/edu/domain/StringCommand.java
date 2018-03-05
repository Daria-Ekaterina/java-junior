package com.acme.edu.domain;

import com.acme.edu.service.Accomulator;
import com.acme.edu.service.Decorator;
import com.acme.edu.service.Type;

import java.util.List;

/**
 * @author Kulakova
 */
 public class StringCommand extends Command {
    public final Type type=Type.STRING;
     private String message;

     public StringCommand(String message){
         this.message=message;
     }
    @Override
    public String decorate() {
        return null;
    }

    @Override
    public Command accumulate() {
        return this;
    }


}