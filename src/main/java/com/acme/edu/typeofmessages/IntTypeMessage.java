package com.acme.edu.typeofmessages;

import com.acme.edu.messagehandlers.BaseTypeMessage;
import com.acme.edu.messagehandlers.Type;

/**
 * @author Kulakova
 */
public class IntTypeMessage extends BaseTypeMessage {
    private int massege;

    public IntTypeMessage(int message){
        massege=message;
    }

    public int getMassege() {
        return massege;
    }

    private void setMassege(int massege) {
        this.massege = massege;
    }
    @Override
    public Type getType(){
        return Type.INT;
    }


    @Override
    public String toStr() {
        return String.valueOf(massege);
    }

    @Override
    public int toInt() {
        return massege;
    }

    //    @Override
//    void checkType(Object message) {
//        if (!Flusher.beforeWasInt) Flusher.flush();
//        if ( (long)(int)message + Flusher.sumInt >= Integer.MAX_VALUE) Flusher.flush();
//        Flusher.sumInt += (int)message;
//        Flusher.beforeWasInt = true;
  //  }
}
