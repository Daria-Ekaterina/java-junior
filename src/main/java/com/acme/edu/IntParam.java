package com.acme.edu;

public class IntParam extends BaseParam {


    @Override
    void printer(Object message) {
        System.out.print("primitive: ");
        super.printer(message);
    }

    @Override
    void checkType(Object message) {
        if (!StateFlush.beforeWasInt) StateFlush.flush();
        if ( (long)(int)message + StateFlush.sumInt >= Integer.MAX_VALUE) StateFlush.flush();
        StateFlush.sumInt += (int)message;
        StateFlush.beforeWasInt = true;
    }
}
