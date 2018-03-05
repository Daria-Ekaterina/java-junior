package com.acme.edu.typeofmessages;

import com.acme.edu.messagehandlers.Accomulator;
import com.acme.edu.messagehandlers.Decorator;

/**
 * @author Kulakova
 */
public class IntTypeMessage extends Command implements Decorator,Accomulator {
    private int massege;

    public IntTypeMessage(int message){
        massege=message;
    }

    @Override
    public String decorate() {
        return String.valueOf(massege);
    }

    @Override
    public boolean accumulate() {

        return false;
    }


    //    @Override
//    void checkType(Object message) {
//        if (!Flusher.beforeWasInt) Flusher.flush();
//        if ( (long)(int)message + Flusher.sumInt >= Integer.MAX_VALUE) Flusher.flush();
//        Flusher.sumInt += (int)message;
//        Flusher.beforeWasInt = true;
  //  }
}
