package com.acme.edu.messagehandlers.printers;

public class ConsolePrinter implements IPrinter {
    @Override
    public void print(String str) {
        System.out.println(str);
    }
}
