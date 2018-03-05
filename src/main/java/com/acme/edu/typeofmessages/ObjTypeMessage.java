package com.acme.edu.typeofmessages;

import com.acme.edu.messagehandlers.Accomulator;
import com.acme.edu.messagehandlers.Decorator;

/**
 * @author Kulakova
 */
public class ObjTypeMessage extends Command  implements Decorator, Accomulator {
    private Object message;
    public ObjTypeMessage(Object message){
        this.message=message;
    }


    @Override
    public String decorate() {
        return null;
    }

    @Override
    public boolean accumulate() {
        return false;
    }
}
