package com.acme.edu.domain;

import com.acme.edu.service.Visitor;

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
    public Command accept(Visitor visitor) {
        return visitor.visitObject(this);
    }

    @Override
    public Type getType() {return type;}

    public Object getMessage() {return message;}

    public void setMessage(Object message) {this.message = message;}


    @Override
    public String decorate() {
        return type.getPrefix()+message.toString();
    }

    @Override
    public Command accumulate(Command command) {
        System.out.println(this.decorate());
        return command;
    }
}
