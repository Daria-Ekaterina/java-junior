package com.acme.edu.domain;

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
