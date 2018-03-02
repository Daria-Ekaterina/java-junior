package com.acme.edu;

import static com.acme.edu.StateFlush.eqString;

public class StringParam extends BaseParam {

    @Override
    void checkType(Object message) {
        if (!StateFlush.beforeWasString) StateFlush.flush();
        if (eqString.equals(message)) {
            StateFlush.sumString++;
            StateFlush.beforeWasString = true;
        } else {
            StateFlush.flush();
            eqString = message.toString();
            StateFlush.sumString++;
            StateFlush.beforeWasString = true;
        }


    }

}
