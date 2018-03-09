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

    public static void log(String message){
        controller.log(new StringCommand(message));
    }

    public static void main(String[] args) {
        Logger.log(1);
        Logger.log(2);
        Logger.log("str 1");
        Logger.log("str 1");
        Logger.log("str 1");
        Logger.flush();
    }

//    public static void log(byte message){
//        controller.log(message);
//    }
//
//    public static void log(char message){
//        controller.log(message);
//    }
//
//    public static void log(String message){
//        controller.log(message);
//    }
//
//    public static void log(boolean message){
//        controller.log(message);
//    }
//
//    public static void log(int... message){
//        controller.log(message);
//    }
//
//    public static void log(int[]... message){
//        controller.log(message);
//    }
//
    public static void log(Object message){
        controller.log(new ObjCommand(message));
    }

}


