package com.acme.edu;

public class LoggingBuffer {
    protected int sumInt;
    protected byte sumByte;
    protected int sumString;
    protected String eqString = "";
    protected boolean beforeWasInt;
    protected boolean beforeWasByte;
    protected boolean beforeWasString = false;

    protected void setAllFalse(){
        this.beforeWasInt = false;
        this.beforeWasByte = false;
        this.beforeWasString = false;
    }


}
