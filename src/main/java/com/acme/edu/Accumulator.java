package com.acme.edu;

import com.acme.edu.commands.*;

public class Accumulator {
    private int sumInt = 0;
    private byte sumByte = 0;
    private int sumStr = 0;

//    public void add(IntCommand message){
//        System.out.println("IntCommand message");
//        sumInt += message.getMessage();
//    }

    public void clear(){
        sumByte = 0;
        sumStr = 0;
        sumInt = 0;
    }

    private Command lastCommand;

    public Command getLastCommand() {
        return lastCommand;
    }

    public void add(Command message) {
        if (message instanceof IntCommand) {
            sumInt += ((IntCommand) message).getMessage();
        }
        if (message instanceof StringCommand) {
            sumStr++;
        }

        lastCommand = message;
    }

    public Command accumulate() {
        if (lastCommand instanceof IntCommand){
            return new IntCommand(sumInt);
        }
        if (lastCommand instanceof StringCommand){
            StringCommand toReturn;
            toReturn = new StringCommand(((StringCommand)lastCommand).getMessage());
            toReturn.setSumStr(sumStr);
            return toReturn;
        }

        return lastCommand;
    }
}
