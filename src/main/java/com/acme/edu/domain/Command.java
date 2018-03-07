package com.acme.edu.domain;
/**
 * Абстрактный класс команда.
 * @author Oskolkova & Kulakova
 */
public abstract class Command {
public void handle(Command message){
        accumulate(message);
        decorate();
    }
    public abstract Type getType();
    public abstract String decorate();
    public abstract Command accumulate(Command command);

}
