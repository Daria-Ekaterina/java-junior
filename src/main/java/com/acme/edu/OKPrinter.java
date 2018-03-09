package com.acme.edu;


public class OKPrinter {
    public void print(String message) {
        System.out.println(message);
    }


/*    private final String CONST_ARRAY = "primitives array: ";
    private final String CONST_REFERENCE = "reference: ";
    private final String CONST_PRIMITIVE = "primitive: ";
    private final String CONST_STRING = "string: ";
    private final String CONST_CHAR = "char: ";
    private final String CONST_MATRIX = "primitives matrix: ";

    public void print(int message){
        System.out.println(CONST_PRIMITIVE + message);
    }

    public void print(byte message){
        System.out.println(CONST_PRIMITIVE + message);
    }

    public void print(String message){
        System.out.println(CONST_STRING + message);
    }

    public void print(boolean message){
        System.out.println(CONST_PRIMITIVE + message);
    }

    public void print(char message){
        System.out.println(CONST_CHAR + message);
    }

    public void print(int[] message){
        System.out.print(CONST_ARRAY);
        printArr(message);
    }

    public void print(int[]... message){
        System.out.print(CONST_MATRIX);
        printMatrix(message);
    }

    public void print(Object message){
        System.out.println(CONST_REFERENCE + message.toString());
    }

    private void printMatrix(int[][] message) {
        System.out.print("{");
        for (int[] aMessage : message) printArr(aMessage);
        System.out.println("}");
    }

    private void printArr(int... array){
        System.out.print("{");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "}");
    }
*/

}
