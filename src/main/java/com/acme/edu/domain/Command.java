package com.acme.edu.domain;
import com.acme.edu.service.Type;

public abstract class Command {
    public static long sum;
    public static String stringSum = "";
    public Type type;

    public void handle(Object message){
        accumulate();
        decorate();
    }
    public abstract String decorate();
    public abstract Command accumulate();

}
