package layers.network;

public interface NetworkPacket {
    public InternetAddress getFrom();
    public InternetAddress getTo();
    public String getContent();
}