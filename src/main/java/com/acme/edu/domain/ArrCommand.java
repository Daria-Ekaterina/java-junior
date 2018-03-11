package com.acme.edu.domain;

import com.acme.edu.service.Visitor;

import java.util.List;

/**
 * @author Kulakova
 */
public class ArrCommand extends Command {
    private int[] array;
    private Type type=Type.ARRAY;
   public ArrCommand(int[] array){
        this.array=array;
    }

    @Override
    public Command accept(Visitor visitor) {
        return visitor.visitArray(this);
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String decorate() {
       StringBuilder strArray=new StringBuilder();
       strArray.append(type.getPrefix());
       strArray.append("{");
        for (int i=0;i<array.length-1;i++) {
            strArray.append(array[i]+", ");
        }
        strArray.append(array[array.length-1]);
        strArray.append("}");
        return strArray.toString();
    }

    @Override
    public Command accumulate(Command command) {
        System.out.println(this.decorate());
        return command;
    }
}
