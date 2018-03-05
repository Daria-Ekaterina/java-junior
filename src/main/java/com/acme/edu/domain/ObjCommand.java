package com.acme.edu.domain;

import java.util.List;

/**
 * @author Kulakova
 */
public class ObjCommand extends Command{
    private Object message;
    public ObjCommand(Object message){
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
