package com.acme.edu.domain;

import com.acme.edu.service.Visitor;

import java.util.List;

/**
 * @author Kulakova
 */
public class CharCommand extends Command{
    private char message;
    private final Type type=Type.CHAR;
    public CharCommand(char message){
        this.message=message;
    }

    @Override
    public Command accept(Visitor visitor) {
        return visitor.visitChar(this);
    }

    @Override
    public Type getType() {return type;}

    public char getMessage() {return message;}
    public void setMessage(char message) {this.message = message;}

    @Override
    public String decorate() {
        return type.getPrefix()+String.valueOf(message);
    }

    @Override
    public Command accumulate(Command command) {
       // System.out.println(command.decorate());
            System.out.println(this.decorate());
          //  message=((CharCommand)command).getMessage();
            return command;
    }


}
