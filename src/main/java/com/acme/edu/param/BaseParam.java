package com.acme.edu.param;

public class BaseParam {

    void printer(Object message){
        System.out.println(message);
    }
     void checkType(Object message){
    }

    public void setCheckType(Object message){
        checkType(message);
    }
}
