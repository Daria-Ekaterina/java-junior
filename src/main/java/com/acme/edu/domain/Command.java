package com.acme.edu.domain;

public abstract class Command {


    public void handle(Command message){
        accumulate(message);
        decorate();
    }

    public abstract String decorate();
    public abstract Command accumulate(Command command);

}
