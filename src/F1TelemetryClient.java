import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

import Constants.*;
import Packets.*;
import Parser.*;

public class F1TelemetryClient {

    private DatagramSocket socket;
    private int port;
    private boolean bigintEnabled;
    private List<Address> forwardAddresses;
    private boolean running = false;

    public F1TelemetryClient(int port, boolean bigintEnabled, List<Address> forwardAddresses) {
        this.port = port;
        this.bigintEnabled = bigintEnabled;
        this.forwardAddresses = forwardAddresses != null ? forwardAddresses : new ArrayList<>();

        try {
            this.socket = new DatagramSocket(this.port);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        running = true;
        System.out.println("UDP Client listening on port " + port + " 🏎");

        byte[] buffer = new byte[2048]; // Adjust buffer size as needed

        while (running) {
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            try {
                socket.receive(packet);
                handleMessage(packet.getData(), packet.getLength());
                bridgeMessage(packet.getData(), packet.getLength());
            } catch (IOException e) {
                System.out.println("Error receiving packet: " + e.getMessage());
                running = false;
            }
        }

        stop();
    }

    private void handleMessage(byte[] data, int length) {
        ByteBuffer buffer = ByteBuffer.wrap(data, 0, length);
        buffer.order(ByteOrder.LITTLE_ENDIAN);

        // Assume the first two bytes represent the packet ID for demonstration purposes
        int packetFormat = buffer.getShort(); // Example: Reading packet format
        int packetId = buffer.get(); // Example: Reading packet ID

        switch (packetId) {
            case 0:
                dispatchEvent(packetId, new PacketMotionDataParser(buffer, packetFormat, bigintEnabled).getData());
            case 1:
                new PacketSessionDataParser(buffer, packetFormat, bigintEnabled);
            case 2:
                new PacketLapDataParser(buffer, packetFormat, bigintEnabled);
            case 3:
                new PacketEventDataParser(buffer, packetFormat, bigintEnabled);
            case 4:
                new PacketParticipantsDataParser(buffer, packetFormat, bigintEnabled);
            case 5:
                new PacketCarSetupDataParser(buffer, packetFormat, bigintEnabled);
            case 6:
                new PacketCarTelemetryDataParser(buffer, packetFormat, bigintEnabled);
            case 7:
                new PacketCarStatusDataParser(buffer, packetFormat, bigintEnabled);
            case 8:
                new PacketFinalClassificationDataParser(buffer, packetFormat, bigintEnabled);
            case 9:
                new PacketLobbyInfoDataParser(buffer, packetFormat, bigintEnabled);
            case 10:
                new PacketCarDamageDataParser(buffer, packetFormat, bigintEnabled);
            case 11:
                new PacketSessionHistoryDataParser(buffer, packetFormat, bigintEnabled);
            default:
                System.out.println("Unknown packet ID: " + packetId);
        }
    }

    private void dispatchEvent(int packetId, Object data) {
        System.out.println("Packet ID: " + packetId + ", Data: " + data);
    }


    private void bridgeMessage(byte[] data, int length) {
        if (forwardAddresses.isEmpty()) {
            return;
        }

        for (Address address : forwardAddresses) {
            try {
                DatagramPacket packet = new DatagramPacket(data, length, address.getIpAddress(), address.getPort());
                socket.send(packet);
            } catch (IOException e) {
                System.out.println("Error sending packet: " + e.getMessage());
            }
        }
    }

    public void stop() {
        running = false;
        if (socket != null && !socket.isClosed()) {
            socket.close();
            System.out.println("UDP Client closed 🏁");
        }
    }

    public static void main(String[] args) {
        // Replace with actual port and settings
        F1TelemetryClient client = new F1TelemetryClient(20777, true, null);
        client.start();
    }
}

class Constants {
    public static final int PACKET_MOTION_TYPE = 0;
    public static final int PACKET_SESSION_TYPE = 1;
    public static final int PACKET_LAP_DATA_TYPE = 2;
    public static final int PACKET_EVENT_TYPE = 3;
    public static final int PACKET_PARTICIPANTS_TYPE = 4;
    public static final int PACKET_CAR_SETUPS_TYPE = 5;
    public static final int PACKET_CAR_TELEMETRY_TYPE = 6;
    public static final int PACKET_CAR_STATUS_TYPE = 7;
    public static final int PACKET_FINAL_CLASSIFICATION_TYPE = 8;
    public static final int PACKET_LOBBY_INFO_TYPE = 9;
    public static final int PACKET_CAR_DAMAGE_TYPE = 10;
    public static final int PACKET_SESSION_HISTORY_TYPE = 11;
}


