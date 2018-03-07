package com.acme.edu.domain;
/**
 * @author Oskolkova & Kulakova
 */
 public class StringCommand extends Command {

    public final Type type=Type.STRING;
    private String message;

    public StringCommand(String message){this.message=message;};

    public String getMessage() {return message;}

    public void setMessage(String message) {this.message = message;}
   @Override
    public Type getType() {return type;}

    @Override
    public String decorate() {
        return type.getPrefix()+message;
    }

    @Override
    public Command accumulate(Command command) {return new StringCommand(message);}
}