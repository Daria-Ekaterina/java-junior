package com.acme.edu;

import com.acme.edu.domain.*;
import com.acme.edu.service.Visitor;
import com.acme.edu.service.printers.ConsolePrinter;
import com.acme.edu.service.printers.Printer;
import java.util.LinkedList;
import java.util.List;


/**
 * Конкретный посетитель.
 * @author Oskolkova & Kulakova
 */
public class Accomulator implements Visitor {
    private static Command finalCommand;
    private static List<Command> comandList = new LinkedList<Command>();
    Printer printer=new ConsolePrinter();

    public void export(Command command){

        if (finalCommand == null) {
            finalCommand = command;
        }
        if (comandList.isEmpty() || comandList.get(comandList.size() - 1).getType() == command.getType()) {
            comandList.add(command.accept(this));
        } else {
            flush();
        }
    }

    public void flush() {
        if (comandList.size() > 1) {
            for (int i = 1; i < comandList.size(); i++) {
                finalCommand =  finalCommand.accumulate(comandList.get(i));
            }
        }
        if (finalCommand != null) {
                printer.print(finalCommand.decorate());
        }
        finalCommand = null;
        comandList.clear();
    }

    @Override
    public IntCommand visitInt(IntCommand intCommand) {

        return intCommand;
    }

    @Override
    public StringCommand visitString(StringCommand strCommand) {

        return strCommand;
    }

    @Override
    public ByteCommand visitByte(ByteCommand byteCommand) {
        return byteCommand;
    }

    @Override
    public BoolCommand visitBool(BoolCommand boolCommand) {

        return boolCommand;
    }

    @Override
    public CharCommand visitChar(CharCommand charCommand) {
        return charCommand;
    }

    @Override
    public ArrCommand visitArray(ArrCommand arrCommand) {
        return arrCommand;
    }

    @Override
    public MatrixCommand visitMatrix(MatrixCommand matrCommand) {
        return matrCommand;
    }

    @Override
    public ObjCommand visitObject(ObjCommand objCommand) {
        return objCommand;
    }
}
