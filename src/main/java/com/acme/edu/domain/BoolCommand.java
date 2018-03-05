package com.acme.edu.domain;

import java.util.List;

/**
 * @author Kulakova
 */
public class BoolCommand extends Command {

    private boolean message;

    public BoolCommand(boolean message){
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
