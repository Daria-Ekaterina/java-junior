package com.acme.edu.domain;

import com.acme.edu.service.Visitor;

import java.io.Serializable;

/**
 * Абстрактный класс команда.
 * @author Oskolkova & Kulakova
 */
public abstract class Command implements Serializable{
public void handle(Command message){
        accumulate(message);
        decorate();
    }

    public abstract Command accept(Visitor visitor);
    public abstract Type getType();
    public abstract String decorate();
    public abstract Command accumulate(Command command);

}
