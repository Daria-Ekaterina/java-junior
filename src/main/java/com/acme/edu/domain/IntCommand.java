package com.acme.edu.domain;

import com.acme.edu.service.Accomulator;

/**
 * @author Oskolkova & Kulakova
 */
public class IntCommand extends Command {
    private int message;
    private final Type type=Type.INT;

    public IntCommand(int message){this.message=message;}

    @Override
    public Type getType() {return type;}
    public int getMessage() {return message;}
    public void setMessage(int message) {this.message = message;}


    @Override
    public String decorate() {
        return Type.INT.getPrefix() + String.valueOf(message);
    }

    @Override
    public Command accumulate(Command command) {
        this.message+=((IntCommand)command).getMessage();
        return new IntCommand(message);
    }
}
