package com.acme.edu.network.client;

import com.acme.edu.domain.IntCommand;

public class ClientProxy {
    private static Connector connector = new Connector();
    public static void main(String[] args) {
         log(5);
    }

    public static void log(int message){connector.send(message);}

}
