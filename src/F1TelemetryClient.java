import Constants.*;
import Packets.*;
import Parser.*;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class F1TelemetryClient {

    private DatagramSocket socket;
    private boolean running;
    private byte[] buf = new byte[256]; // Adjust buffer size based on expected packet size

    public F1TelemetryClient(int port) {
        try {
            socket = new DatagramSocket(port);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        running = true;
        while (running) {
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            try {
                socket.receive(packet);

                InetAddress address = packet.getAddress();
                int port = packet.getPort();
                packet = new DatagramPacket(buf, buf.length, address, port);

                // Here you would parse the message similar to parseBufferMessage
                handlePacket(packet.getData(), packet.getLength());

            } catch (IOException e) {
                e.printStackTrace();
                running = false;
            }
        }
        socket.close();
    }

    private void handlePacket(byte[] data, int length) {
        // Parse the packet
        // For now, just print out the received data
        String received = new String(data, 0, length);
        System.out.println("Packet received: " + received);
        // Further processing would be similar to handleMessage in TypeScript
    }

    public void stop() {
        running = false;
        socket.close();
    }

    public static void main(String[] args) {
        F1TelemetryClient client = new F1TelemetryClient(20777);
        client.start();
    }
}
