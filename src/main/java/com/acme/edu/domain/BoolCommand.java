package com.acme.edu.domain;

/**
 * @author Oskolkova & Kulakova
 */
public class BoolCommand extends Command {
    private boolean message;
    private Type type=Type.BOOLEAN;
    public BoolCommand(boolean message){
        this.message=message;
    }
    @Override
    public Type getType() {return type;}

    public boolean isMessage() {return message;}
    public void setMessage(boolean message) {this.message = message;}

    @Override
    public String decorate() {
        return null;
    }

    @Override
    public Command accumulate(Command command) {
        return null;
    }



}
