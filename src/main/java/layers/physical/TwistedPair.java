package layers.physical;

public class TwistedPair implements BitSender {
    public void sendBytes(byte[] bytes) {
        System.out.println("Sending bytes: "+bytes+" over a twisted pair cable.");
    }
}
