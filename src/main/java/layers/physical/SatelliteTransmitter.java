package layers.physical;

public class SatelliteTransmitter implements BitSender {
    public void sendBytes(byte[] bytes) {
        System.out.println("Sending bytes: "+bytes+" over satellite communication.");
    }
}
