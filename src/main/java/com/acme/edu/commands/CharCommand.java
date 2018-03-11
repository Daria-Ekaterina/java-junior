package com.acme.edu.commands;

import com.acme.edu.Command;

public class CharCommand implements Command {
    private String prefix = "char: ";
    private char message;

    @Override
    public String toString() {
        return String.valueOf(message);
    }

    public CharCommand(char message) {
        this.message = message;
    }

    @Override
    public String getPrefix() {
        return prefix;
    }


}
