package com.acme.edu.param;

 public class StringParam extends BaseParam {

    @Override
    void checkType(Object message) {
        if (!Flusher.beforeWasString) Flusher.flush();
        if (Flusher.eqString.equals(message)) {
            Flusher.sumString++;
            Flusher.beforeWasString = true;
        } else {
            Flusher.flush();
            Flusher.eqString = message.toString();
            Flusher.sumString++;
            Flusher.beforeWasString = true;
        }


    }

}