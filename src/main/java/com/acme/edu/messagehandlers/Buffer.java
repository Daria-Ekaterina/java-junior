package com.acme.edu.messagehandlers;

public class Buffer {
    private Type type;
    private int sumInt;
    private byte sumByte;
    private int sumString;
    private String eqString = "";
    private boolean beforeWasInt;
    private boolean beforeWasByte;
    private boolean beforeWasString = false;

    private boolean flusher=false;

    public void setAllFalse(){
        this.beforeWasInt = false;
        this.beforeWasByte = false;
        this.beforeWasString = false;

    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getSumInt() {
        return sumInt;
    }

    public void setSumInt(int sumInt) {
        this.sumInt += sumInt;
    }

    public byte getSumByte() {
        return sumByte;
    }

    public void setSumByte(byte sumByte) {
        this.sumByte += sumByte;
    }

    public int getSumString() {
        return sumString;
    }

    public void setSumString(int sumString) {
        this.sumString += sumString;
    }

    public String getEqString() {
        return eqString;
    }

    public void setEqString(String eqString) {
        this.eqString = eqString;
    }

    public boolean isBeforeWasInt() {
        return beforeWasInt;
    }

    public void setBeforeWasInt(boolean beforeWasInt) {
        this.beforeWasInt = beforeWasInt;
    }


    public boolean isBeforeWasByte() {
        return beforeWasByte;
    }

    public void setBeforeWasByte(boolean beforeWasByte) {
        this.beforeWasByte = beforeWasByte;
    }

    public boolean isBeforeWasString() {
        return beforeWasString;
    }

    public void setBeforeWasString(boolean beforeWasString) {
        this.beforeWasString = beforeWasString;
    }

    public boolean isFlusher() {
        return flusher;
    }

    public void setFlusher(boolean flusher) {
        this.flusher = flusher;
    }
}
