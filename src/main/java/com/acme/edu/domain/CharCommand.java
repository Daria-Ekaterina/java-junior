package com.acme.edu.domain;

import java.util.List;

/**
 * @author Kulakova
 */
public class CharCommand extends Command{
    private char message;
    private final Type type=Type.CHAR;
    public CharCommand(char message){
        this.message=message;
    }
    @Override
    public Type getType() {return type;}

    public char getMessage() {return message;}
    public void setMessage(char message) {this.message = message;}

    @Override
    public String decorate() {
        return type.getPrefix()+String.valueOf(message);
    }

    @Override
    public Command accumulate(Command command) {
        return new CharCommand(message);
    }


}
