package layers.physical;

/**
 * Created by omri on 18/08/18.
 */
public class OpticFiber implements BitSender {
    public void sendBytes(byte[] bytes) {
        System.out.println("Sending bytes: "+bytes+" over an optic fiber.");
    }
}
