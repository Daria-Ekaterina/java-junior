package com.acme.edu;
import com.acme.edu.service.printers.ConsolePrinter;
import com.acme.edu.domain.Command;
import com.acme.edu.service.printers.Printer;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Управление процессом логирования.
 * @author Oskolkova & Kulakova
 */
public class Controller {

    private static List<Command> comandList = new LinkedList<Command>();

    private Printer printer=new ConsolePrinter();

    private static Command finalCommand;

    public void log(Command command){
        if(finalCommand==null){finalCommand=command;}
        if(comandList.isEmpty()||comandList.get(comandList.size()-1).getType()==command.getType()){
            comandList.add(command);
        }else {
            flush();
        }
    }

    public void flush() {
        if(comandList.size()>1){
            for(int i=0;i<comandList.size()-1;i++){finalCommand=finalCommand.accumulate(comandList.get(i));}

            //IntStream.range(0, comandList.size() - 1).forEach(i -> finalCommand = finalCommand.accumulate(comandList.get(i))); //лямбда

        }
        printer.print(finalCommand.decorate());
        finalCommand=null;
        comandList.clear();
    }
//
    public static void main(String[] args) {
        Logger.log(1);
        Logger.flush();
        Logger.log(0);
        Logger.flush();
        Logger.log(-1);
        Logger.flush();


        Logger.log((byte) 1);
        Logger.flush();
        Logger.log((byte) 0);
        Logger.flush();
        Logger.log((byte) -1);
        Logger.flush();

        Logger.log('a');
        Logger.log('b');
        Logger.flush();

        Logger.log("test string 1");
        Logger.log("other str");
        Logger.flush();
    }
        //
//        Logger.log(true);
//        Logger.log(false);
//
//        Logger.log(new Object());
//
//        Logger.log("str 1");
//        Logger.log(1);
//        Logger.log(2);
//        Logger.flush();
//        Logger.log("str 2");
//        Logger.flush();
//        Logger.log(0);
//        Logger.flush();
//
//
//        Logger.log("str 1");
//        Logger.flush();
//        Logger.log(10);
//        Logger.flush();
//        Logger.log(Integer.MAX_VALUE);
//        Logger.flush();
//        Logger.log("str 2");
//        Logger.flush();
//        Logger.log(0);
//        Logger.flush();
//
//        Logger.log("str 1");
//        Logger.flush();
//        Logger.log((byte)10);
//        Logger.flush();
//        Logger.log((byte)Byte.MAX_VALUE);
//        Logger.flush();
//        Logger.log("str 2");
//        Logger.flush();
//        Logger.log(0);
//        Logger.flush();
//
//
//
//        Logger.log("str 1");
//        Logger.log("str 2");
//        Logger.log("str 2");
//        Logger.flush();
//        Logger.log(0);
//        Logger.flush();
//        Logger.log("str 2");
//        Logger.log("str 3");
//        Logger.log("str 3");
//        Logger.log("str 3");
//        Logger.flush();
 }
