package com.acme.edu.commands;

import com.acme.edu.Command;

public class BoolCommand implements Command {

    private String prefix = "primitive: ";
    private boolean message;

    @Override
    public String toString() {
        return String.valueOf(message);
    }

    public BoolCommand(boolean message) {
        this.message = message;
    }

    @Override
    public String getPrefix() {
        return prefix;
    }

}
