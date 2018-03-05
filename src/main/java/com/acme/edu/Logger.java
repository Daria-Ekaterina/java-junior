package com.acme.edu;

import com.acme.edu.domain.*;

/**
 * Logs messages.
 * @author Oskolkova & Kulakova
 */
public class Logger {
    /**
     * Static variable Controller for control all that happens.
     * @author Oskolkova
     */
   // private static Controller controller = new Controller();
    private static com.acme.edu.service.Controller contr = new com.acme.edu.service.Controller();

    public static void flush(){
       // controller.flush();
     //   Printer.flush();
    }

    public static void log(int message){
        IntCommand command = new IntCommand(message);
        contr.controll(command);
        //contr.send(new IntCommand(message));
       // controller.log(message);
    }

    public static void log(byte message){
      //  controller.log(message);
        contr.controll(new ByteCommand(message));
    }

    public static void log(char message){
        contr.controll(new CharCommand(message));
      //  controller.log(message);
    }

    public static void log(String message){
        contr.controll(new StringCommand(message));
      //  controller.log(message);
    }

    public static void log(boolean message){
        contr.controll(new BoolCommand(message));
      //  controller.log(message);
    }

    public static void log(Object message){
        //     controller.log(message);
        contr.controll(new ObjCommand(message));
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


