package Parser;

import Packets.TyreStintsHistoryData;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class TyreStintsHistoryDataParser extends F1Parser<TyreStintsHistoryData> {

    public TyreStintsHistoryDataParser() {
        // Constructor can be empty as there's no specific initialization required here
    }

    @Override
    protected TyreStintsHistoryData parse(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        TyreStintsHistoryData data = new TyreStintsHistoryData();

        data.setM_endLap(byteBuffer.get() & 0xFF);
        data.setM_tyreActualCompound(byteBuffer.get() & 0xFF);
        data.setM_tyreVisualCompound(byteBuffer.get() & 0xFF);

        return data;
    }
}

