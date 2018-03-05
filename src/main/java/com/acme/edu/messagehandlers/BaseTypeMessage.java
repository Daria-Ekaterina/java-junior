package com.acme.edu.messagehandlers;

/**
 * @author Kulakova
 */
public class BaseTypeMessage {
Decorator decorator;
Accomulator accom;

public void handle(Object message){
    if(accom.accumulate()){
        decorator.decorate();
    }
}
//
//    protected boolean accumulate() {
//        return false;
//    }
//
//    protected void decorate() {
//
//    }

}
