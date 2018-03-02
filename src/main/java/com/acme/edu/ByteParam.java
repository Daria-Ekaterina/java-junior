package com.acme.edu;

public class ByteParam extends BaseParam {


    @Override
    void printer(Object message) {
        System.out.print("primitive: ");
        super.printer(message);
    }

    @Override
    void checkType(Object message) {
        if (!StateFlush.beforeWasByte) StateFlush.flush();
        if ( (int)(byte)message + StateFlush.sumByte >= Byte.MAX_VALUE) StateFlush.flush();
        StateFlush.sumByte += (byte)message;
        StateFlush.beforeWasByte = true;
    }


}
