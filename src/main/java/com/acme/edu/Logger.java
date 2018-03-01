package com.acme.edu;

/**
 * Logs messages.
 * @author Oskolkova & Kulakova
 */
public class Logger {
    private static final String CONST_PRIMITIVE = "primitive: ";
    private static final String CONST_CHAR = "char: ";
    private static final String CONST_STRING = "string: ";
    private static final String CONST_REFERENCE = "reference: ";
    private static final String CONST_ARRAY = "primitives array: ";
    private static final String CONST_MATRIX = "primitives matrix: ";



    private static int sumInt;
    private static byte sumByte;
    private static int sumString;
    private static String eqString = "";

    private static boolean beforeWasInt;
    private static boolean beforeWasByte;
    private static boolean beforeWasString = false;

    public static void flush(){//wtf it must do?//может быть, выведи мне все, что накопилось?
        if (beforeWasInt) {
            print2Args(CONST_PRIMITIVE,  String.valueOf(sumInt));
            sumInt = 0;
        }
        if (beforeWasByte) {
            print2Args(CONST_PRIMITIVE,  String.valueOf(sumByte));
            sumByte = 0;
        }
        if (beforeWasString) {
            if (sumString == 1) print2Args(CONST_STRING, eqString);
            else if (sumString > 1)print2Args(CONST_STRING, eqString + " (x" + sumString + ")");
            eqString = "";
            sumString = 0;
        }
        setAllFalse();
    }

    private static void setAllFalse(){
        beforeWasInt = false;
        beforeWasByte = false;
        beforeWasString = false;
    }

    private static void printArray(int[] array){
        System.out.print("{");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "}");
    }

    private static void print2Args(String s1, String s2){
        System.out.println(s1 + s2);
    }

    public static void log(int message){
        if (!beforeWasInt) flush();
        if ((long) message + sumInt >= Integer.MAX_VALUE) flush();
        sumInt += message;
        beforeWasInt = true;
    }

    public static void log(byte message){
        if (!beforeWasByte) flush();
        if ((int) message + sumByte >= Byte.MAX_VALUE) flush();

        sumByte += message;
        beforeWasByte = true;
    }

    public static void log(char message){
        flush();
        print2Args(CONST_CHAR, String.valueOf(message));
    }

    public static void log(String message){
        if (!beforeWasString) flush();
        if (eqString.equals(message)) {
                sumString++;
                beforeWasString = true;
            } else {
                flush();
                eqString = message;
                sumString++;
                beforeWasString = true;
            }

    }

    public static void log(boolean message){
        flush();
        print2Args(CONST_PRIMITIVE, String.valueOf(message));
    }


    public static void log(int... message){
        flush();
        System.out.print(CONST_ARRAY);
        printArray(message);
    }

    public static void log(int[]... message){
        flush();
        System.out.print(CONST_MATRIX);
        printMatrix(message);

    }

    private static void printMatrix(int[][] matrix) {
        System.out.print("{");
        for (int i = 0; i < matrix.length ; i++) {
            printArray(matrix[i]);
        }
        System.out.println("}");

    }

    public static void log(Object message){
        flush();
        print2Args(CONST_REFERENCE, String.valueOf(message));
    }

}


