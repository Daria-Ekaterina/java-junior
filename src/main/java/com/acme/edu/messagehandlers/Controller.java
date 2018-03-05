package com.acme.edu.messagehandlers;
import com.acme.edu.Logger;
import com.acme.edu.messagehandlers.printers.Printer;


public class Controller {
    SaverMessage saver = new SaverMessage();
    Printer printer = new Printer() ;
    Buffer buf=new Buffer();

public void send(BaseTypeMessage message){

    saver.save(message);
  //  buf.setType(message.getType());
    printer.print(saver);
   // controlType(message);
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
