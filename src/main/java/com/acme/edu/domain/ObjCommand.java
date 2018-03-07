package com.acme.edu.domain;
/**
 * @author Oskolkova & Kulakova
 */
public class ObjCommand extends Command{
    private Object message;
    private final Type type=Type.OBJECT;

    public ObjCommand(Object message){
        this.message=message;
    }
    @Override
    public Type getType() {return type;}

    public Object getMessage() {return message;}

    public void setMessage(Object message) {this.message = message;}


    @Override
    public String decorate() {
        return null;
    }

    @Override
    public Command accumulate(Command command) {
        return null;
    }
}
