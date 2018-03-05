package com.acme.edu.messagehandlers;
import com.acme.edu.Logger;
import com.acme.edu.messagehandlers.printers.ConsolePrinter;
import com.acme.edu.messagehandlers.printers.IPrinter;
import com.acme.edu.typeofmessages.Command;

import java.util.LinkedList;
import java.util.List;

public class Controller {
    private static List<Command> comandList = new LinkedList<Command>();
    private IPrinter printer=new ConsolePrinter();
    public void controll(Command command){
       command.handle(command);
       if(comandList.isEmpty()){
           comandList.add(command);
       }else{
           if(comandList.get(comandList.size()-1).equals(command)){
               comandList.add(command);
           }else{
               for(Command com:comandList){
                   printer.print(com.decorate());
               }

           }
       }

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
//        controller.send(new IntTypeMessage(1));
//        controller.send(new IntTypeMessage(2));
//        controller.send(new IntTypeMessage(3));
//        Printer.flush();
    }




}
