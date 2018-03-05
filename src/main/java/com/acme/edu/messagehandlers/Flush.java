package com.acme.edu.messagehandlers;

import java.util.List;

/**
 * @author Kulakova
 */
public class Flush {
    public static void flush(List<BaseTypeMessage> listMessage){
        listMessage.clear();
        for(BaseTypeMessage li:listMessage){
            System.out.println(li.toStr());
        }
    }
}
