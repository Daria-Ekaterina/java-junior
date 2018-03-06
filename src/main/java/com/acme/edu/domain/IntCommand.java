package com.acme.edu.domain;

import com.acme.edu.service.Accomulator;

/**
 * @author Kulakova
 */
public class IntCommand extends Command {
    private int message;

    public int getMessage(){
        return message;
    }
   public final Type type=Type.INT;
  // public static int sum = 0;

    public IntCommand(int message){
        this.message=message;
    }
    @Override
    public String decorate() {
        return Type.INT + String.valueOf(message);
    }



    @Override
    public Command accumulate(Command command) {
        this.message+=((IntCommand)command).getMessage();
        return new IntCommand(message);
    }




//    public Command accumulate2(){
//        sum += message;
////        return new IntCommand(sum);
//    }




    //    @Override
//    void checkType(Object message) {
//        if (!Flusher.beforeWasInt) Flusher.flush();
//        if ( (long)(int)message + Flusher.sumInt >= Integer.MAX_VALUE) Flusher.flush();
//        Flusher.sumInt += (int)message;
//        Flusher.beforeWasInt = true;
  //  }
}
