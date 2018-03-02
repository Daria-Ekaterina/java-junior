package com.acme.edu.param;

public class IntParam extends BaseParam {


    @Override
    void checkType(Object message) {
        if (!Flusher.beforeWasInt) Flusher.flush();
        if ( (long)(int)message + Flusher.sumInt >= Integer.MAX_VALUE) Flusher.flush();
        Flusher.sumInt += (int)message;
        Flusher.beforeWasInt = true;
    }



}
