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
    @Override
    public Type getType() {return type;}

    public byte getMessage() {return message;}

    public void setMessage(byte message) {this.message = message;}


    @Override
    public String decorate() {
        return type.getPrefix()+String.valueOf(message);
    }

    @Override
    public Command accumulate(Command command) {
        return null;
    }


}
