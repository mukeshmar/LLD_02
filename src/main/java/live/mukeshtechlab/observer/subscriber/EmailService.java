package live.mukeshtechlab.observer.subscriber;

public class EmailService implements Subscriber {
    @Override
    public void update() {
        System.out.println("Email has been sent to the subscriber");
    }
}
