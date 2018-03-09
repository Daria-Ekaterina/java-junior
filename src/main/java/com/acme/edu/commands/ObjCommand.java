package com.acme.edu.commands;

import com.acme.edu.Command;

public class ObjCommand implements Command {
    private String prefix = "reference: ";
    private Object message;

    @Override
    public String toString() {
        return message.toString();
    }

    public ObjCommand(Object message) {
        this.message = message;
    }

    @Override
    public String getPrefix() {
        return prefix;
    }
}
