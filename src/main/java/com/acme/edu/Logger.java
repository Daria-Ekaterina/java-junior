package com.acme.edu;

import com.acme.edu.domain.*;

/**
 * Logs messages.
 * @author Oskolkova & Kulakova
 */
public class Logger {
    /**
     * Static variable Controller for control all that happens.
     * @author
     */

    private static Controller controller = new Controller();
    public static void flush(){

    }
    public static void log(int message){
        controller.controll(new IntCommand(message));
    }

    public static void log(byte message){
        controller.controll(new ByteCommand(message));
    }

    public static void log(char message){
        controller.controll(new CharCommand(message));
    }

    public static void log(String message){
        controller.controll(new StringCommand(message));
    }

    public static void log(boolean message){
        controller.controll(new BoolCommand(message));
    }

    public static void log(Object message){
        controller.controll(new ObjCommand(message));
    }

//    public static void log(int... message){
//        controller.log(message);
//    }
//
//    public static void log(int[]... message){
//        controller.log(message);
//    }


//
//    private static final String CONST_ARRAY = "primitives array: ";
//    private static final String CONST_MATRIX = "primitives matrix: ";
//
//    public static  void flush(){
//        Flusher.flush();
//    }
//    public static void log(Object message){
//        new Controller(new ObjCommand(),message);
//    }
//
//    public static void log(int message){
//         new Controller(new IntCommand(),message);
//    }
//
//    public static void log(byte message){
//         new Controller(new ByteCommand(),message);
//    }
//
//    public static void log(char message){
//         new Controller(new CharCommand(),message);
//    }
//
//    public static void log(String message){
//        new Controller(new StringCommand(),message);
//        }
//
//    public static void log(boolean message){
//        new Controller(new BoolTypeMessage(),message);
//        }
//
//
//    public static void log(int... message){
//
////        new Controller(new ArrCommand(),message);
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


