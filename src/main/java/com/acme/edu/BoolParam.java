package com.acme.edu;

import static com.acme.edu.StateFlush.CONST_PRIMITIVE;
import static com.acme.edu.StateFlush.flush;
import static com.acme.edu.StateFlush.print2Args;

public class BoolParam extends BaseParam {
    @Override
    void checkType(Object message) {
        flush();
        print2Args(CONST_PRIMITIVE, String.valueOf(message));

    }
}
