package com.acme.edu;

import java.lang.reflect.Parameter;

/**
 * Logs messages.
 * @author Oskolkova & Kulakova
 */
public class Logger {

    private static final String CONST_ARRAY = "primitives array: ";
    private static final String CONST_MATRIX = "primitives matrix: ";

    public static  void flush(){
        StateFlush.flush();
    }
    public static void log(Object message){
        new Controller(new ObjParam(),message);
    }

    public static void log(int message){
         new Controller(new IntParam(),message);
    }

    public static void log(byte message){
         new Controller(new ByteParam(),message);
    }

    public static void log(char message){
         new Controller(new CharParam(),message);
    }

    public static void log(String message){
        new Controller(new StringParam(),message);
        }

    public static void log(boolean message){
        new Controller(new BoolParam(),message);
        }


    public static void log(int... message){

//        new Controller(new ArrParam(),message);

        StateFlush.flush();
        System.out.print(CONST_ARRAY);
        StateFlush.printArray(message);
    }

    public static void log(int[]... message){
        StateFlush.flush();
        System.out.print(CONST_MATRIX);
        printMatrix(message);

    }

    private static void printMatrix(int[][] matrix) {
        System.out.print("{");
        for (int i = 0; i < matrix.length ; i++) {
            StateFlush.printArray(matrix[i]);
        }
        System.out.println("}");

    }


}


