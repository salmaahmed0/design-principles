package designPrinsiples.DIP.after;

public class Gmail implements IMessage{
    @Override
    public void send(){
        System.out.println("Gmail");
    }
}
