package Packets;

public abstract class PacketBase {
    private PacketHeader header;

    public PacketHeader getHeader() {
        return header;
    }

    public void setHeader(PacketHeader header) {
        this.header = header;
    }
}

