package com.acme.edu.typeofmessages;

import com.acme.edu.messagehandlers.BaseTypeMessage;
import com.acme.edu.messagehandlers.Type;

/**
 * @author Kulakova
 */
public class BoolTypeMessage extends BaseTypeMessage {
//    @Override
//    void checkType(Object message) {
//        flush();
//        print2Args(CONST_PRIMITIVE, String.valueOf(message));
//
//    }
    private boolean message;

    public BoolTypeMessage(boolean message){
        this.message=message;
    }

    public boolean isMassege() {
        return message;
    }

    public void setMassege(boolean massege) {
        this.message = massege;
    }
    @Override
    public Type getType(){
        return Type.BOOLEAN;
    }
    @Override
    public String toStr() {
        return String.valueOf(message);
    }
}
