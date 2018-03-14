package com.acme.edu.network.client;

import com.acme.edu.domain.Command;

import java.io.*;
import java.net.Socket;

public class Connector {

    //public static void main(String[] args) {
    public void send(Object command){
        try(Socket socket = new Socket("localhost", 6666)){
            ObjectOutputStream pw = new ObjectOutputStream(socket.getOutputStream());
            pw.writeObject(command);
            pw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
