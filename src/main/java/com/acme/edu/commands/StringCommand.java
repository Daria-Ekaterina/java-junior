package com.acme.edu.commands;

import com.acme.edu.Command;

public class StringCommand implements Command {
    private String prefix = "string: ";
    private String message = "";
    private int sumStr = 1;

    public String getMessage(){
        String s = message;
        if (sumStr > 1) s = s + " (x" + sumStr + ")";
        return s;
    }

    public void setSumStr(int num){
        sumStr = num;
    }

    @Override
    public String toString() {
        return message;
    }

    @Override
    public String getPrefix() {
        return prefix;
    }

    public StringCommand(String message) {
        this.message = message;
    }

}
