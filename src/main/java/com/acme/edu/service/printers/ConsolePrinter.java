package com.acme.edu.service.printers;

import com.acme.edu.domain.Command;

public class ConsolePrinter implements IPrinter {
    @Override
    public void print(Command str) {
        System.out.println(str);
    }
}
