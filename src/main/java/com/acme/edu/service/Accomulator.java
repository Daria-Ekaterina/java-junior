package com.acme.edu.service;

import com.acme.edu.domain.Command;

public interface Accomulator {
    Command command = null;
    boolean accumulate();
}
