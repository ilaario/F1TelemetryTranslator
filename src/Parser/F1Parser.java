package Parser;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class F1Parser<T> {
    /**
     * Parses the binary data from a byte array into a structured object of type T.
     * @param buffer the byte array containing the binary data.
     * @return an object of type T parsed from the binary data.
     */
    public T fromBuffer(byte[] buffer) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(buffer);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN); // Assuming little endian as most binary data in network/comms is little endian.
        return parse(byteBuffer);
    }

    /**
     * Abstract method to be implemented by subclasses to parse data from a ByteBuffer.
     * @param byteBuffer the ByteBuffer to parse.
     * @return an object of type T parsed from the ByteBuffer.
     */
    protected abstract T parse(ByteBuffer byteBuffer);

    public static int getRemainingBytes(ByteBuffer buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException("ByteBuffer non può essere null");
        }
        return buffer.remaining();  // Questo metodo ritorna il numero di elementi tra la position e il limit.
    }
}

