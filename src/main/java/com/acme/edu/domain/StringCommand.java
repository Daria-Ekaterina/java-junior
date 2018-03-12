package com.acme.edu.domain;

import com.acme.edu.service.Visitor;

/**
 * @author Oskolkova & Kulakova
 */
 public class StringCommand extends Command {
    private int sumString = 1;
    public final Type type=Type.STRING;
    private String message;

    public StringCommand(String message){this.message=message;};

    public String getMessage() {return message;}

    public void setMessage(String message) {this.message = message;}

    @Override
    public Command accept(Visitor visitor) {
        return visitor.visitString(this);
    }

    @Override
    public Type getType() {return type;}

    @Override
    public String decorate() {
        if (sumString <=1 ){
        return type.getPrefix()+message;}
        else return type.getPrefix() + message + " (x" + sumString + ")";
    }

    @Override
    public boolean equals(Object obj) {
        return this.message == ((StringCommand)obj).message;
    }



    @Override
    public Command accumulate(Command command) {
        if(command.equals(this)){
            this.sumString++;
            return this;
        }else{
            System.out.println(this.decorate());
            return command;
        }
       // return new StringCommand(this.getMessage());
    }
}