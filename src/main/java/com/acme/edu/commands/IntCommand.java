package com.acme.edu.commands;

import com.acme.edu.Command;

public class IntCommand implements Command {
    private String prefix = "primitive: ";
    private int message = 0;

    public int getMessage(){
        return message;
    }

    @Override
    public String toString() {
        return String.valueOf(message);
    }

    @Override
    public String getPrefix() {
        return prefix;
    }

    public IntCommand(int message) {
        this.message = message;
    }
}
