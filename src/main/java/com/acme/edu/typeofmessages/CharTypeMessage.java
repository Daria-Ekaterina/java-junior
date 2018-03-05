package com.acme.edu.typeofmessages;

import com.acme.edu.messagehandlers.BaseTypeMessage;
import com.acme.edu.messagehandlers.Type;

/**
 * @author Kulakova
 */
public class CharTypeMessage extends BaseTypeMessage {

    private char message;
    public CharTypeMessage(char message){
        this.message=message;
    }

    public char getMessage() {
        return message;
    }

    public void setMessage(char message) {
        this.message = message;
    }
    @Override
    public Type getType(){
        return Type.CHAR;
    }
    public String toStr() {
        return String.valueOf(message);
    }
    //    @Override
//    void checkType(Object message) {
//        Flusher.flush();
//        Flusher.print2Args(Flusher.CONST_CHAR, String.valueOf(message));
//    }
}
