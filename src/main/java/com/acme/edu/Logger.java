package com.acme.edu;

//kdjghdfkgjhdfkgjhdfkgj
/*
gkjfhkgjfhg
лоралопралопр
лпораплорапл
 */


import static com.acme.edu.Logger.*;
import static java.lang.Math.sin;

/**
 * Logs messages.
 * @author EK
 * @param
 * @see
 */
public class Logger {

    public static void printer2Args(String s1, String s2){
        System.out.println(s1 + s2);
    }

    public static void log(char message){
        printer2Args("char: ", Character.toString(message));
//        System.out.println("char: " + message);
    }

    public static void log(String message){
        printer2Args("string: ", message);
//        System.out.println("string: " + message);
    }

    public static void log(byte message){
        printer2Args("primitive: ", Byte.toString(message));
//        System.out.println("primitive: " + message);
    }

    public static void log(boolean message){
        printer2Args("primitive: ", Boolean.toString(message));
//        System.out.println("primitive: " + message);
    }

    public static void log(int message){
        printer2Args("primitive: ", Integer.toString(message));
//        System.out.println("primitive: " + message);
    }

    public static void log(Object message){
        printer2Args("reference: ", message.toString());
//        System.out.println("reference: " + message);
    }

    //region state
//    public static String state = null; //Global state
//    public static final String MY_CONST = "";
//    //endregion
//
//    static {
//        System.out.println(Logger.state);
//        log(1, 2);
//    }
//
//    public static int log(int i1, int i2) {
//        int localIntVar = 0; //local, auto, temp, stack
//        //region output
//        System.out.println("primitive: " + localIntVar);
//        return 0;
//        //endregion
//    }
//
//    public static void log(byte message) {
//        int localIntVar = 0;
//        System.out.println("primitive: " + message);
//        log(0);
//    }
//
//    public static void log(int message) {
//        sin(0);
//    }
//}
//
//class Demo {
//    public static void main(String[] args) {
//        log(1,1);
//        log(0);
//        System.out.println(MY_CONST);
//    }
}
