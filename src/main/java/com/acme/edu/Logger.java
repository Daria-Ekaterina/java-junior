package com.acme.edu;

//import com.acme.edu.param.*;

import com.acme.edu.commands.*;


/**
 * Logs messages.
 * @author Oskolkova & Kulakova
 */
public class Logger {
    /**
     * Static variable Controller for control all that happens.
     * @author Oskolkova
     */
    private static Controller controller = new Controller();


    public static void flush(){
        controller.flush();
    }

    public static void log(int message){
        controller.log(new IntCommand(message));
    }

    public static void log(char message){
        controller.log(new CharCommand(message));
    }

    public static void log(boolean message){
        controller.log(new BoolCommand(message));
    }

    public static void log(byte message){
        controller.log(new ByteCommand(message));
    }

    public static void log(String message){
        controller.log(new StringCommand(message));
    }

    public static void log(int[] message){
        controller.log(new ArrCommand(message));
    }

    public static void log(int[][] message){
        controller.log(new MatrixCommand(message));
    }

//    public static void main(String[] args) {
//        Logger.log(1);
//        Logger.log(2);
//        Logger.log("str 0");
//        Logger.log("str 1");
//        Logger.log("str 1");
//        Logger.log("str 1.5");
//        Logger.log(1);
//        Logger.log(10);
//        Logger.log(Integer.MAX_VALUE);
//        Logger.log(Integer.MAX_VALUE);
//        Logger.log(4);
//        Logger.log("str 2");
//        Logger.flush();
//    }

    public static void log(Object message){
        controller.log(new ObjCommand(message));
    }

}


