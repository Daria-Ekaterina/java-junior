package com.acme.edu;


import com.acme.edu.commands.ByteCommand;
import com.acme.edu.commands.IntCommand;
import com.acme.edu.commands.StringCommand;

/**
 * This class controls all that happens while logging
 * @author Oskolkova
 */

public class Controller {
    private Accumulator accumulator = new Accumulator();
    private Decorator decorator = new Decorator();
    private OKPrinter printer = new OKPrinter();

    public void log(Command message){
        if (accumulator.getLastCommand() == null) {
            if (accumulator.add(message)){
                return;
            } else {
                flush();
            }
            accumulator.add(message);
        }
        if (message.getClass() == accumulator.getLastCommand().getClass() &&
                (message instanceof ByteCommand || message instanceof IntCommand || message instanceof StringCommand)){
            if (!accumulator.add(message)){
                flush();
                accumulator.add(message);
            }

        }
        else {
            flush();
            if (!accumulator.add(message)){
                flush();
                accumulator.add(message);
            }
        }

    }

    public void flush(){
        Command command = accumulator.accumulate();
        accumulator.clear();
        printer.print(decorator.decorate(command));
    }
//    private LoggingBuffer buffer = new LoggingBuffer();
//    private OKFlusher flusher = new OKFlusher();
//    private OKPrinter printer = new OKPrinter();

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

}
