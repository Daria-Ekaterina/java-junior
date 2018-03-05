package com.acme.edu.typeofmessages;

import com.acme.edu.messagehandlers.BaseTypeMessage;
import com.acme.edu.messagehandlers.Type;

/**
 * @author Kulakova
 */
public class ObjTypeMessage extends BaseTypeMessage {
    private Object message;
    public ObjTypeMessage(Object message){
        this.message=message;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }
    @Override
    public Type getType(){
        return Type.OBJECT;
    }
    public String toStr() {
        return String.valueOf(message);
    }
//    @Override
//    void checkType(Object message) {
//        Flusher.flush();
//
//    }
}
