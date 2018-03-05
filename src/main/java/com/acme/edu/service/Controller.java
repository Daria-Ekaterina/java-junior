package com.acme.edu.service;
import com.acme.edu.Logger;
import com.acme.edu.service.printers.ConsolePrinter;
import com.acme.edu.service.printers.IPrinter;
import com.acme.edu.domain.Command;

import java.util.LinkedList;
import java.util.List;

public class Controller {
    private static List<Command> comandList = new LinkedList<Command>();

    private IPrinter printer=new ConsolePrinter();

    public void controll(Command command){
        if(comandList.isEmpty() || comandList.get(comandList.size()-1).type==command.type){
            comandList.add(command);
        }else {
            flush();
        }
    }

    private void flush() {
        for (Command co:comandList) {
            co.accumulate();
        }
        //printer.print(Command.decorate());

        //command.handle(command);
        comandList.clear();
    }

    public static void main(String[] args) {
        Logger.log(1);
        Logger.flush();
        Logger.log(0);
        Logger.flush();
        Logger.log(-1);
        Logger.flush();

        Logger.log((byte)1);
        Logger.flush();
        Logger.log((byte)0);
        Logger.flush();
        Logger.log((byte)-1);
        Logger.flush();

        Logger.log('a');
        Logger.log('b');
        Logger.flush();

        Logger.log("test string 1");
        Logger.log("other str");
        Logger.flush();

        Logger.log(true);
        Logger.log(false);

        Logger.log(new Object());

        Logger.log("str 1");
        Logger.log(1);
        Logger.log(2);
        Logger.flush();
        Logger.log("str 2");
        Logger.flush();
        Logger.log(0);
        Logger.flush();


        Logger.log("str 1");
        Logger.flush();
        Logger.log(10);
        Logger.flush();
        Logger.log(Integer.MAX_VALUE);
        Logger.flush();
        Logger.log("str 2");
        Logger.flush();
        Logger.log(0);
        Logger.flush();

        Logger.log("str 1");
        Logger.flush();
        Logger.log((byte)10);
        Logger.flush();
        Logger.log((byte)Byte.MAX_VALUE);
        Logger.flush();
        Logger.log("str 2");
        Logger.flush();
        Logger.log(0);
        Logger.flush();



        Logger.log("str 1");
        Logger.log("str 2");
        Logger.log("str 2");
        Logger.flush();
        Logger.log(0);
        Logger.flush();
        Logger.log("str 2");
        Logger.log("str 3");
        Logger.log("str 3");
        Logger.log("str 3");
        Logger.flush();

//        Controller controller = new Controller();
//        controller.send(new IntCommand(1));
//        controller.send(new IntCommand(2));
//        controller.send(new IntCommand(3));
//        Printer.flush();
    }




}
