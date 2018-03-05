package com.acme.edu.messagehandlers;
/**
 * @author Kulakova
 */
public abstract class BaseTypeMessage {

    public Type getType(){
        return Type.OBJECT;
    }

    public String toStr(){
        return "";
    }

    public int toInt(){
        return 0;
    }

    public byte toByte(){
        return 0;
    }



}
