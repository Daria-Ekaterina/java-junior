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
        return type.getPrefix()+message;
    }

    @Override
    public Command accumulate(Command command) {
        System.out.println(this.decorate());
        //  message=((CharCommand)command).getMessage();
        return command;
    }



}
