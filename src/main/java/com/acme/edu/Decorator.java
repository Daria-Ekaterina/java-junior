package com.acme.edu;

public class Decorator {

    public String decorate(Command command){
        return command.getPrefix() + command.toString();
    }
}
