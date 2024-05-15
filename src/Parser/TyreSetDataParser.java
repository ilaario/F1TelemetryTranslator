package Parser;

import Packets.TyreSetData;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class TyreSetDataParser extends F1Parser<TyreSetData> {

    public TyreSetDataParser() {
        // Constructor can be empty as there's no specific initialization required here
    }

    @Override
    protected TyreSetData parse(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        TyreSetData data = new TyreSetData();

        data.setM_actualTyreCompound(byteBuffer.get() & 0xFF);
        data.setM_visualTyreCompound(byteBuffer.get() & 0xFF);
        data.setM_wear(byteBuffer.get() & 0xFF);
        data.setM_available(byteBuffer.get() & 0xFF);
        data.setM_recommendedSession(byteBuffer.get() & 0xFF);
        data.setM_lifeSpan(byteBuffer.get() & 0xFF);
        data.setM_usableLife(byteBuffer.get() & 0xFF);
        data.setM_lapDeltaTime(byteBuffer.getShort());
        data.setM_fitted(byteBuffer.get() & 0xFF);

        return data;
    }
}

