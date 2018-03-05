package com.acme.edu.typeofmessages;

import com.acme.edu.messagehandlers.Accomulator;
import com.acme.edu.messagehandlers.Decorator;

/**
 * @author Kulakova
 */
public class ByteTypeMessage extends Command implements Decorator, Accomulator {

    private byte message;

    public ByteTypeMessage(byte message){
        this.message=message;
    }

    public String toStr() {
        return String.valueOf(message);
    }


    @Override
    public boolean accumulate() {
        return false;
    }

    @Override
    public String decorate() {
        return String.valueOf(message);

    }
}
