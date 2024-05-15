package Parser;

import Packets.*;
import Constants.EventCode;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;


public class PacketEventDataParser extends F1Parser<PacketEvent> {
    private final int packetFormat;
    private final boolean bigintEnabled;
    private static final List<EventCode> VEHICLE_EVENT_CODES = Arrays.asList(
            EventCode.Retirement,
            EventCode.TeammateInPits,
            EventCode.RaceWinner,
            EventCode.DriveThroughServed,
            EventCode.StopGoServed
    );

    public PacketEventDataParser(ByteBuffer buffer, int packetFormat, boolean bigintEnabled) {
        this.packetFormat = packetFormat;
        this.bigintEnabled = bigintEnabled;
        parse(buffer); // Immediately parse the buffer upon instantiation
    }

    @Override
    protected PacketEvent parse(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        PacketEvent data = new PacketEvent();

        PacketHeaderParser headerParser = new PacketHeaderParser(packetFormat, bigintEnabled);
        data.setHeader(headerParser.parse(byteBuffer));

        byte[] eventCodeBytes = new byte[4];
        byteBuffer.get(eventCodeBytes);
        String eventStringCode = new String(eventCodeBytes).trim();

        data.setM_eventStringCode(eventStringCode);

        EventCode eventStringEvent = EventCode.getEventCode(eventStringCode);

        switch (eventStringEvent) {
            case EventCode.FastestLap:
                data.setEventDetails(new FastestLapParser().parse(byteBuffer));
                break;
            case EventCode.SpeedTrapTriggered:
                data.setEventDetails(new SpeedTrapParser(packetFormat).parse(byteBuffer));
                break;
            case EventCode.PenaltyIssued:
                data.setEventDetails(new PenaltyParser().parse(byteBuffer));
                break;
            case EventCode.Flashback:
                data.setEventDetails(new FlashbackParser().parse(byteBuffer));
                break;
            case EventCode.StartLights:
                data.setEventDetails(new StartLightsParser().parse(byteBuffer));
                break;
            case EventCode.ButtonStatus:
                data.setEventDetails(new ButtonsParser().parse(byteBuffer));
                break;
            case EventCode.Overtake:
                data.setEventDetails(new OvertakeParser().parse(byteBuffer));
                break;
            case null:
                break;
            default:
                if (VEHICLE_EVENT_CODES.contains(eventStringCode)) {
                    data.setEventDetails(new VehicleEventParser().parse(byteBuffer));
                }
                break;
        }

        return data;
    }

    static class VehicleEventParser extends F1Parser<VehicleEventDetails> {
        public VehicleEventParser() {
            super();
        }

        @Override
        protected VehicleEventDetails parse(ByteBuffer byteBuffer) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            VehicleEventDetails data = new VehicleEventDetails() {
                @Override
                public void setEventDetails(Object parsed) {
                }
            };
            data.setVehicleIdx(byteBuffer.get() & 0xFF);
            return data;
        }
    }

    static class FastestLapParser extends F1Parser<FastestLapEventDetails> {
        public FastestLapParser() {
            super();
        }

        @Override
        protected FastestLapEventDetails parse(ByteBuffer byteBuffer) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            FastestLapEventDetails data = new FastestLapEventDetails();
            data.setVehicleIdx(byteBuffer.get() & 0xFF);
            data.setLapTime(byteBuffer.getFloat());
            return data;
        }
    }

    static class FlashbackParser extends F1Parser<FlashbackEventDetails> {
        public FlashbackParser() {
            super();
        }

        @Override
        protected FlashbackEventDetails parse(ByteBuffer byteBuffer) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            FlashbackEventDetails data = new FlashbackEventDetails();
            data.setFlashbackFrameIdentifier(byteBuffer.getInt());
            data.setFlashbackSessionTime(byteBuffer.getFloat());
            return data;
        }
    }

    static class StartLightsParser extends F1Parser<LightEventDetails> {
        public StartLightsParser() {
            super();
        }

        @Override
        protected LightEventDetails parse(ByteBuffer byteBuffer) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            LightEventDetails data = new LightEventDetails();
            data.setNumLights(byteBuffer.get() & 0xFF);
            return data;
        }
    }

    static class ButtonsParser extends F1Parser<ButtonEventDetails> {
        public ButtonsParser() {
            super();
        }

        @Override
        protected ButtonEventDetails parse(ByteBuffer byteBuffer) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            ButtonEventDetails data = new ButtonEventDetails();
            data.setButtonStatus(byteBuffer.getInt());
            return data;
        }
    }

    class OvertakeParser extends F1Parser<OvertakeEventDetails> {
        public OvertakeParser() {
            super();
        }

        @Override
        protected OvertakeEventDetails parse(ByteBuffer byteBuffer) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            OvertakeEventDetails data = new OvertakeEventDetails();
            data.setOvertakingVehicleIdx(byteBuffer.get() & 0xFF);
            data.setBeingOvertakenVehicleIdx(byteBuffer.get() & 0xFF);
            return data;
        }
    }

    static class SpeedTrapParser extends F1Parser<SpeedTrapEventDetails> {
        private final int packetFormat;

        public SpeedTrapParser(int packetFormat) {
            this.packetFormat = packetFormat;
        }

        @Override
        protected SpeedTrapEventDetails parse(ByteBuffer byteBuffer) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            SpeedTrapEventDetails data = new SpeedTrapEventDetails();

            data.setVehicleIdx(byteBuffer.get() & 0xFF);
            data.setSpeed(byteBuffer.getFloat());

            if (packetFormat >= 2022) {
                data.setIsOverallFastestInSession(byteBuffer.get() & 0xFF);
                data.setIsDriverFastestInSession(byteBuffer.get() & 0xFF);
                data.setFastestVehicleIdxInSession(byteBuffer.get() & 0xFF);
                data.setFastestSpeedInSession(byteBuffer.getFloat());
            }

            return data;
        }
    }

    public class PenaltyParser extends F1Parser<PenaltyEventDetails> {

        public PenaltyParser() {
            // Constructor can be empty as there's no specific initialization required here
        }

        @Override
        protected PenaltyEventDetails parse(ByteBuffer byteBuffer) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            PenaltyEventDetails data = new PenaltyEventDetails();

            data.setPenaltyType(byteBuffer.get() & 0xFF);
            data.setInfringementType(byteBuffer.get() & 0xFF);
            data.setVehicleIdx(byteBuffer.get() & 0xFF);
            data.setOtherVehicleIdx(byteBuffer.get() & 0xFF);
            data.setTime(byteBuffer.get() & 0xFF);
            data.setLapNum(byteBuffer.get() & 0xFF);
            data.setPlacesGained(byteBuffer.get() & 0xFF);

            return data;
        }
    }

}

