package com.acme.edu.domain;

import java.util.List;

/**
 * @author Kulakova
 */
public class ArrCommand extends Command {
    private int[] array;

    ArrCommand(int[] array){
        this.array=array;
    }


    @Override
    public String decorate() {
        return null;
    }

    @Override
    public Command accumulate() {
        return this;
    }


}
