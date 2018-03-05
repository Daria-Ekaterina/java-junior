package com.acme.edu.domain;

import com.acme.edu.service.Accomulator;
import com.acme.edu.service.Decorator;
import com.acme.edu.service.Type;

import java.util.List;

/**
 * @author Kulakova
 */
public class IntCommand extends Command {
    private int message;
  //  public static List<Integer> summ;
   public final Type type=Type.INT;
   public static int sum = 0;

    public IntCommand(int message){
        this.message=message;
    }
    @Override
    public String decorate() {
        return Type.INT + String.valueOf(message);
    }

    @Override
    public Command accumulate() {
        sum+=message;
        return this;
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
