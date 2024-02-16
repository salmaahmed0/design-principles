package designPrinsiples.DIP.after;

public class Notification {
    private IMessage message ;
    public void setMailType(IMessage message){
        this.message = message;
    }
    public void sendMail(){
        message.send();
    }
}
