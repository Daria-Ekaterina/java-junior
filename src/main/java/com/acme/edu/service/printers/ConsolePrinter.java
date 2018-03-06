package com.acme.edu.service.printers;

import com.acme.edu.domain.Command;

public class ConsolePrinter implements Printer {
    @Override
    public void print(Command str) {
        System.out.println(str);
    }
}
