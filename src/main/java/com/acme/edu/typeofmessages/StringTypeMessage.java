package com.acme.edu.typeofmessages;

import com.acme.edu.messagehandlers.BaseTypeMessage;
import com.acme.edu.messagehandlers.Type;

/**
 * @author Kulakova
 */
 public class StringTypeMessage extends BaseTypeMessage {

     private String message;

     public StringTypeMessage(String message){
         this.message=message;
     }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public Type getType(){
        return Type.STRING;
    }

    public String toStr() {
        return message;
    }

    @Override
    public int toInt() {return 1;}

    //    @Override
//    void checkType(Object message) {
//        if (!Flusher.beforeWasString) Flusher.flush();
//        if (Flusher.eqString.equals(message)) {
//            Flusher.sumString++;
//            Flusher.beforeWasString = true;
//        } else {
//            Flusher.flush();
//            Flusher.eqString = message.toString();
//            Flusher.sumString++;
//            Flusher.beforeWasString = true;
//        }
//
//
//    }

}