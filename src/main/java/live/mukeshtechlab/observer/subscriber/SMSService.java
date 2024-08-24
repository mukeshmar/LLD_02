package live.mukeshtechlab.observer.subscriber;

public class SMSService implements Subscriber{
    @Override
    public void update() {
        System.out.println("SMS has been sent to the subscriber");
    }
}
