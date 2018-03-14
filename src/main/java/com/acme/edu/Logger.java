package com.acme.edu;
import com.acme.edu.domain.*;
/**
 * Logs messages.
 * @author Oskolkova & Kulakova
 */
public class Logger {
    private static Controller controller = new Controller();
    public static void flush(){controller.flush();}

    public static void log(int message){
        controller.log(new IntCommand(message));
    }

    public static void log(byte message){
        controller.log(new ByteCommand(message));
    }

    public static void log(char message){
        controller.log(new CharCommand(message));
    }

    public static void log(String message){
        controller.log(new StringCommand(message));
    }

    public static void log(boolean message){
        controller.log(new BoolCommand(message));
    }

    public static void log(Object message){
        controller.log(new ObjCommand(message));
    }

    public static void log(int[] message){controller.log(new ArrCommand(message));}

    public static void log(int[][] message){controller.log(new MatrixCommand(message));}
}


