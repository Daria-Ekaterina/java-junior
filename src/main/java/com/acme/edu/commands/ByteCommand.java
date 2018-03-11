package com.acme.edu.commands;

import com.acme.edu.Command;

public class ByteCommand implements Command {
    private String prefix = "primitive: ";
    private byte message = 0;

    public byte getMessage(){
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

    public ByteCommand(byte message) {
        this.message = message;
    }

}
