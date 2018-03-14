package com.acme.edu.network.server;

import com.acme.edu.domain.Command;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Acceptor {

    public static void main(String[] args) {
        try (ServerSocket portListener = new ServerSocket(6666);){

            while(true){
                try(Socket clientSession = portListener.accept();
                    ObjectInputStream br = new ObjectInputStream(clientSession.getInputStream())){
                   // System.out.println("we are here");

                    String line=null;
                    String cc = br.readObject().toString();
                    System.out.println(cc);
//                    while ((line=br.readLine())!=null){
//                        System.out.println(">>>>>"+line);
//                    }
                }catch (IOException e){
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
