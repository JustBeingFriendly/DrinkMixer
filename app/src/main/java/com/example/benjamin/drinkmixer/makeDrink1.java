package com.example.benjamin.drinkmixer;

import java.io.*;
import java.net.*;


public class makeDrink1  {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();

        byte[] buf = new byte[256];
        InetAddress address = InetAddress.getLocalHost();
        DatagramPacket packet = new DatagramPacket(buf, buf.length, address, Integer.parseInt(args[0]));

        System.out.println("Sending...");
        socket.send(packet);

        System.out.println("Receiving...");
        packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);

        String received = new String(packet.getData(), 0, packet.getLength());
        System.out.println(received);
        System.out.println("Done!");

        socket.close();
    }
}
