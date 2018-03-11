package com.acme.edu.commands;

import com.acme.edu.Command;

public class MatrixCommand implements Command {
    private String prefix = "primitives matrix: ";
    private int[][] message;

    private String arrayToString(int[] array){
        StringBuilder stringBuilder = new StringBuilder("{");
        for (int i = 0; i < array.length - 1; i++) {
            stringBuilder.append(array[i]);
            stringBuilder.append(", ");
        }
        stringBuilder.append(array[array.length - 1]);
        stringBuilder.append("}");
        return stringBuilder.toString();


    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        for (int[] aMessage : message) {
            stringBuilder.append(arrayToString(aMessage));
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public MatrixCommand(int[][] message) {
        this.message = message;
    }

    @Override
    public String getPrefix() {
        return prefix;
    }


}
