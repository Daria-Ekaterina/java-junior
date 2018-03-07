package com.acme.edu.domain;

/**
 * @author Kulakova
 */
public class MatrixCommand extends Command {
    private int[][] array;
    private Type type=Type.MATRIX;
   public MatrixCommand(int[][] array){
        this.array=array;
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
       for (int j = 0; j < array.length; j++){
           strArray.append("{");
        for (int i=0;i<array[j].length;i++) {
            if(i==array[j].length-1){
                strArray.append(array[j][i]);
            }else {
                strArray.append(array[j][i]+", ");
            }
        }
        strArray.append("}");
       }

       strArray.append("}");
        return strArray.toString();
    }

    @Override
    public Command accumulate(Command command) {
        System.out.println(this.decorate());
        return command;
    }
}
