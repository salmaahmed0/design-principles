package designPrinsiples.DIP.after;

public class Main {
    public static void main(String[] args) {
        Notification notification = new Notification();

        notification.setMailType(new Gmail());
        notification.sendMail();

        notification.setMailType(new Hotmail());
        notification.sendMail();
    }
}
