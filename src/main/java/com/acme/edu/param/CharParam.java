package com.acme.edu.param;

public class CharParam extends BaseParam {

    @Override
    void checkType(Object message) {
        Flusher.flush();
        Flusher.print2Args(Flusher.CONST_CHAR, String.valueOf(message));
    }
}
