package com.acme.edu.domain;

import java.util.List;

/**
 * @author Kulakova
 */
public class CharCommand extends Command{

    private char message;
    public CharCommand(char message){
        this.message=message;
    }


    public String toStr() {
        return String.valueOf(message);
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
