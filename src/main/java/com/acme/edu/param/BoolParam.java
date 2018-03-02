package com.acme.edu.param;

import static com.acme.edu.param.Flusher.CONST_PRIMITIVE;
import static com.acme.edu.param.Flusher.flush;
import static com.acme.edu.param.Flusher.print2Args;

public class BoolParam extends BaseParam {
    @Override
    void checkType(Object message) {
        flush();
        print2Args(CONST_PRIMITIVE, String.valueOf(message));

    }
}
