package com.example.benjamin.drinkmixer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class make_drink1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_drink1);
    }
        public void main(String[] args) throws IOException {
            DatagramSocket socket = new DatagramSocket();

            byte[] buf = new byte[256];
            InetAddress serverAddr = InetAddress.getByName("192.168.1.2");
            DatagramSocket socket = new DatagramSocket();
            byte[] bufSent = "register".getBytes();
            DatagramPacket dpSent = new DatagramPacket(bufSent,bufSent.length, serverAddr, 8088);
            socket.send(dpSent);
            byte[] bufRecv = new byte[1024];
            DatagramPacket dpReceive = new DatagramPacket(bufRecv, bufRecv.length);
            socket.receive(dpReceive);
            String serverMessage = new String(dpReceive.getData(), 0, dpReceive.getLength());
            Log.v(LOGTAG, "Received " + serverMessage);

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
