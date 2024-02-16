package designPrinsiples.DIP.before;

public class Notification {
    private Gmail gmail;
    public void setGmail(Gmail gmail){
        this.gmail = gmail;
    }
    public void sendMail(){
        gmail.send();
    }
}
