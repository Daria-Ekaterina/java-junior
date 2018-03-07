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
        if ((int)this.message + ((ByteCommand)command).getMessage() > Byte.MAX_VALUE) {
            System.out.println(this.decorate());
            return command;
        } else {
            this.message += ((ByteCommand) command).getMessage();
            return new ByteCommand(message);
        }
    }


}
