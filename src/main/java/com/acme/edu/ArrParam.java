package com.acme.edu;

import static com.acme.edu.StateFlush.flush;

public class ArrParam extends BaseParam {
    @Override
    void checkType(Object message) {
        flush();
        System.out.print(StateFlush.CONST_ARRAY);
      //  StateFlush.printArray(message);
    }
}
