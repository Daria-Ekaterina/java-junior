package com.acme.edu;

import com.acme.edu.messagehandlers.BaseTypeMessage;
import com.acme.edu.messagehandlers.SaverMessage;

import com.acme.edu.typeofmessages.*;

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
    private static com.acme.edu.messagehandlers.Controller contr = new com.acme.edu.messagehandlers.Controller();

    public static void flush(){
       // controller.flush();
     //   Printer.flush();
    }

    public static void log(int message){
        IntTypeMessage command = new IntTypeMessage(message);
        contr.controll(command);
        //contr.send(new IntTypeMessage(message));
       // controller.log(message);
    }

    public static void log(byte message){
      //  controller.log(message);
        contr.controll(new ByteTypeMessage(message));
    }

    public static void log(char message){
        contr.controll(new CharTypeMessage(message));
      //  controller.log(message);
    }

    public static void log(String message){
        contr.controll(new StringTypeMessage(message));
      //  controller.log(message);
    }

    public static void log(boolean message){
        contr.controll(new BoolTypeMessage(message));
      //  controller.log(message);
    }

    public static void log(Object message){
        //     controller.log(message);
        contr.controll(new ObjTypeMessage(message));
    }

    public static void log(int... message){
        controller.log(message);
    }

    public static void log(int[]... message){
        controller.log(message);
    }


//
//    private static final String CONST_ARRAY = "primitives array: ";
//    private static final String CONST_MATRIX = "primitives matrix: ";
//
//    public static  void flush(){
//        Flusher.flush();
//    }
//    public static void log(Object message){
//        new Controller(new ObjTypeMessage(),message);
//    }
//
//    public static void log(int message){
//         new Controller(new IntTypeMessage(),message);
//    }
//
//    public static void log(byte message){
//         new Controller(new ByteTypeMessage(),message);
//    }
//
//    public static void log(char message){
//         new Controller(new CharTypeMessage(),message);
//    }
//
//    public static void log(String message){
//        new Controller(new StringTypeMessage(),message);
//        }
//
//    public static void log(boolean message){
//        new Controller(new BoolTypeMessage(),message);
//        }
//
//
//    public static void log(int... message){
//
////        new Controller(new ArrTypeMessage(),message);
//
//        Flusher.flush();
//        System.out.print(CONST_ARRAY);
//        Flusher.printArray(message);
//    }
//
//    public static void log(int[]... message){
//        Flusher.flush();
//        System.out.print(CONST_MATRIX);
//        printMatrix(message);
//
//    }
//
//    private static void printMatrix(int[][] matrix) {
//        System.out.print("{");
//        for (int i = 0; i < matrix.length ; i++) {
//            Flusher.printArray(matrix[i]);
//        }
//        System.out.println("}");
//
//    }
//

}


