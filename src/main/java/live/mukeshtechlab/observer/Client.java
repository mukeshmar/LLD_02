package live.mukeshtechlab.observer;

import live.mukeshtechlab.observer.publisher.Amazon;
import live.mukeshtechlab.observer.subscriber.EmailService;
import live.mukeshtechlab.observer.subscriber.SMSService;
import live.mukeshtechlab.observer.subscriber.Subscriber;

public class Client {
    public static void main(String[] args){
        Amazon amazon = new Amazon();

        Subscriber emailService = new EmailService();
        Subscriber smsService = new SMSService();
        amazon.subscribe(emailService);
        amazon.subscribe(smsService);

        amazon.orderPlaced();
    }
}
