package com.acme.edu;

public class StateFlush {
    protected static final String CONST_ARRAY = "primitives array: ";
    protected static final String CONST_REFERENCE = "reference: ";
    protected static final String CONST_PRIMITIVE = "primitive: ";
    protected static final String CONST_STRING = "string: ";
    protected static final String CONST_CHAR = "char: ";
    protected static int sumInt;
    protected static byte sumByte;
    protected static int sumString;
    protected static String eqString = "";
    protected static boolean beforeWasInt;
    protected static boolean beforeWasByte;
    protected static boolean beforeWasString = false;

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

    protected static void printArray(int[] array){
        System.out.print("{");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "}");
    }

    protected static void print2Args(String s1, String s2){
        System.out.println(s1 + s2);
    }
}
