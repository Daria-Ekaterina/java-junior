//package com.acme.edu;
//
//
///**
// * This class controls all that happens while logging
// * @author Oskolkova
// */
//
//public class Controller {
//    private LoggingBuffer buffer = new LoggingBuffer();
//    private OKFlusher flusher = new OKFlusher();
//    private OKPrinter printer = new OKPrinter();
//
//    public void flush() {
//        flusher.flush(buffer, printer);
//    }
//
//    public void log(int message) {
//        if (!buffer.beforeWasInt) flush();
//        if ( (long)message + buffer.sumInt >= Integer.MAX_VALUE) flush();
//        buffer.sumInt += message;
//        buffer.beforeWasInt = true;
//    }
//
//    public void log(String message){
//        if (!buffer.beforeWasString) flush();
//        if (buffer.eqString.equals(message)) {
//            buffer.sumString++;
//            buffer.beforeWasString = true;
//        } else {
//            flusher.flush(buffer, printer);
//            buffer.eqString = message;
//            buffer.sumString++;
//            buffer.beforeWasString = true;
//        }
//
//    }
//
//    public void log(byte message){
//        if (!buffer.beforeWasByte) flush();
//        if ( (int)message + buffer.sumByte >= Byte.MAX_VALUE) flush();
//        buffer.sumByte += message;
//        buffer.beforeWasByte = true;
//    }
//
//    public void log(char message){
//        flush();
//        printer.print(message);
//    }
//
//    public void log(boolean message){
//        flush();
//        printer.print(message);
//    }
//
//    public void log(int... message){
//        flush();
//        printer.print(message);
//    }
//
//    public void log(int[]... message){
//        flush();
//        printer.print(message);
//    }
//
//    public void log(Object message) {
//        flush();
//        printer.print(message);
//    }
//
//}
