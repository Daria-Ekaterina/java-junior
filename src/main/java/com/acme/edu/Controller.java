package com.acme.edu;
import com.acme.edu.service.printers.ConsolePrinter;
import com.acme.edu.domain.Command;
import com.acme.edu.service.printers.Printer;
import java.util.LinkedList;
import java.util.List;
/**
 * Управление процессом логирования.
 * @author Oskolkova & Kulakova
 */
public class Controller {

    private static List<Command> comandList = new LinkedList<Command>();

    private Printer printer = new ConsolePrinter();

    private static Command finalCommand;

    public void log(Command command) {
        if (finalCommand == null) {
            finalCommand = command;
        }
        if (comandList.isEmpty() || comandList.get(comandList.size() - 1).getType() == command.getType()) {
            comandList.add(command);
        } else {
            flush();
        }

    }

    /**
     *
     */
    public void flush() {
        if (comandList.size() > 1) {
            for (int i = 1; i < comandList.size(); i++) {
                finalCommand = finalCommand.accumulate(comandList.get(i));
            }
        }
        if (finalCommand != null) {
            printer.print(finalCommand.decorate());
        }
        finalCommand = null;
        comandList.clear();
    }
 }
