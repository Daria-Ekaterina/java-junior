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
        lastCommand = null;
    }

    private Command lastCommand;

    public Command getLastCommand() {
        return lastCommand;
    }

    public boolean add(Command message) {
        if (message instanceof IntCommand) {
            if (((IntCommand) message).getMessage() + (long) sumInt > Integer.MAX_VALUE){
                return false;
            } else {
                sumInt += ((IntCommand) message).getMessage();
            }
        }
        if (message instanceof ByteCommand) {
            if (((ByteCommand) message).getMessage() + (int) sumByte > Byte.MAX_VALUE){
                return false;
            } else {
                sumByte += ((ByteCommand) message).getMessage();
            }
        }

        if (message instanceof StringCommand) {
            if (lastCommand == null) {sumStr++; lastCommand = message; return true;}
            if (((StringCommand)message).getMessage().equals(lastCommand.toString())) {
                sumStr++;
            } else {
                return false;
            }
        }

        lastCommand = message;
        return true;
    }

    public Command accumulate() {
        if (lastCommand instanceof IntCommand){
            return new IntCommand(sumInt);
        }
        if (lastCommand instanceof ByteCommand){
            return new ByteCommand(sumByte);
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
