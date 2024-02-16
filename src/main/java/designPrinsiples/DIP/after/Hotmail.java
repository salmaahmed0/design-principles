package designPrinsiples.DIP.after;

public class Hotmail implements IMessage{
    @Override
    public void send() {
        System.out.println("Hotmail");
    }
}
