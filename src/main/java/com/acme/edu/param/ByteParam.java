package com.acme.edu.param;

public class ByteParam extends BaseParam {


    @Override
    void printer(Object message) {
        System.out.print("primitive: ");
        super.printer(message);
    }

    @Override
    void checkType(Object message) {
        if (!Flusher.beforeWasByte) Flusher.flush();
        if ( (int)(byte)message + Flusher.sumByte >= Byte.MAX_VALUE) Flusher.flush();
        Flusher.sumByte += (byte)message;
        Flusher.beforeWasByte = true;
    }


}
