package Packets;

public class LightEventDetails {
    private int numLights;

    public LightEventDetails(int numLights) {
        this.numLights = numLights;
    }

    public LightEventDetails() {
    }

    public int getNumLights() {
        return numLights;
    }

    public void setNumLights(int numLights) {
        this.numLights = numLights;
    }

    public void setEventDetails(Object parsed){
        if (parsed instanceof LightEventDetails parsedDetails){
            this.numLights = parsedDetails.numLights;
        }
    }

    @Override
    public String toString() {
        return "LightEventDetails{" +
                "numLights=" + numLights +
                '}';
    }
}
