package designPrinsiples.DIP.before;

public class Main {
    public static void main(String[] args) {
        Gmail gmail = new Gmail();
        Notification notification = new Notification();

        notification.setGmail(gmail);
        notification.sendMail();
    }
}
