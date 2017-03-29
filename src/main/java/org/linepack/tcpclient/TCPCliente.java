package org.linepack.tcpclient;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPCliente {

    public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
        byte[] ipServer = {10, 0, 0, 104};
        InetAddress address = InetAddress.getByAddress(ipServer);
        Socket cliente = new Socket(address, 12345);
        ObjectInputStream inp = new ObjectInputStream(cliente.getInputStream());
        Object retornoServer = inp.readObject();
        System.out.println(retornoServer);
    }
}
