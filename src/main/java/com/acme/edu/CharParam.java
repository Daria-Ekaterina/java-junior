package com.acme.edu;

public class CharParam extends BaseParam {

    @Override
    void checkType(Object message) {
        StateFlush.flush();
        StateFlush.print2Args(StateFlush.CONST_CHAR, String.valueOf(message));
    }
}
