package layers.physical;

/**
 * Created by omri on 18/08/18.
 */
public class CoaxialCable implements BitSender {
    public void sendBytes(byte[] bytes) {
        System.out.println("Sending bytes: "+bytes+" over a coaxial cable.");
    }
}
