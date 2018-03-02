package com.acme.edu;

import static com.acme.edu.StateFlush.CONST_REFERENCE;
import static com.acme.edu.StateFlush.flush;
import static com.acme.edu.StateFlush.print2Args;

public class ObjParam extends BaseParam {
    @Override
    void checkType(Object message) {
        flush();
        print2Args(CONST_REFERENCE, String.valueOf(message));

    }
}
