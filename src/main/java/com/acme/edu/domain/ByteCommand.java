package com.acme.edu.domain;

/**
 * @author Kulakova
 */
public class ByteCommand extends Command {
    public final Type type=Type.BYTE;
    private byte message;

    public ByteCommand(byte message){
        this.message=message;
    }

    public String toStr() {
        return String.valueOf(message);
    }



    @Override
    public String decorate() {
        return String.valueOf(message);

    }

    @Override
    public Command accumulate() {
        return this;
    }

}
