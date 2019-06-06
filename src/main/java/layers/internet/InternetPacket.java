package layers.internet;

public interface InternetPacket {
    public InternetAddress getFrom();
    public InternetAddress getTo();
    public String getContent();
}