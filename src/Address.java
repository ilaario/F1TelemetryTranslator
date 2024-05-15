import java.net.InetAddress;
import java.net.UnknownHostException;

public class Address {
    private String ip;
    private int port;

    public Address(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    public InetAddress getIpAddress() throws UnknownHostException {
        return InetAddress.getByName(ip);
    }

    public int getPort() {
        return port;
    }
}
