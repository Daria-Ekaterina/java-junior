package com.acme.edu.param;

import static com.acme.edu.param.Flusher.flush;

public class ArrParam extends BaseParam {
    @Override
    void checkType(Object message) {
        flush();
        System.out.print(Flusher.CONST_ARRAY);
      //  Flusher.printArray(message);
    }
}
