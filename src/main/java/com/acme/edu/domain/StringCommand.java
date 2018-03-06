package com.acme.edu.domain;

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