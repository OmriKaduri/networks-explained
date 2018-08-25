package layers.physical;

public class RadioTransmitter implements BitSender {
    public void sendBytes(byte[] bytes) {
        System.out.println("Sending bytes: "+bytes+" over radio waves.");
    }
}
