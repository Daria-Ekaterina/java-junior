package com.acme.edu.typeofmessages;

import com.acme.edu.messagehandlers.BaseTypeMessage;
import com.acme.edu.messagehandlers.Type;

/**
 * @author Kulakova
 */
public class ByteTypeMessage extends BaseTypeMessage {

    private byte message;
    public ByteTypeMessage(byte message){
        this.message=message;
    }

    public byte getMessage() {
        return message;
    }

    public void setMessage(byte message) {
        this.message = message;
    }
    @Override
    public Type getType(){
        return Type.BYTE;
    }

    public String toStr() {
        return String.valueOf(message);
    }

    @Override
    public byte toByte() {
        return (byte)message;
    }
    //    @Override
//    void printer(Object message) {
//        System.out.print("primitive: ");
//        super.printer(message);
//    }
//
//    @Override
//    void checkType(Object message) {
//        if (!Flusher.beforeWasByte) Flusher.flush();
//        if ( (int)(byte)message + Flusher.sumByte >= Byte.MAX_VALUE) Flusher.flush();
//        Flusher.sumByte += (byte)message;
//        Flusher.beforeWasByte = true;
//    }


}
