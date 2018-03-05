package com.acme.edu.messagehandlers;

public enum Type {
    INT("primitive: "),
    BYTE("primitive: "),
    BOOLEAN("primitive: "),
    CHAR("char: "),
    STRING("string: "),
    OBJECT("reference: "),
    ARRAY("primitives array: "),
    MATRIX("primitives matrix: "),
    MultiDimArray("primitives multimatrix: ");

    private final String prefix;

    Type(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }
}
