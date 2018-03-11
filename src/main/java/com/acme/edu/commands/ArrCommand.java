package com.acme.edu.commands;

import com.acme.edu.Command;

public class ArrCommand implements Command {
    private String prefix = "primitives array: ";
    private int[] message;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        for (int i = 0; i < message.length - 1; i++) {
            stringBuilder.append(message[i]);
            stringBuilder.append(", ");
        }
        stringBuilder.append(message[message.length - 1]);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public ArrCommand(int[] message) {
        this.message = message;
    }

    @Override
    public String getPrefix() {
        return prefix;
    }


}
