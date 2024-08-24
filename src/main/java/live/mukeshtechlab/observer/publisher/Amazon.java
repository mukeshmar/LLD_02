package live.mukeshtechlab.observer.publisher;

import live.mukeshtechlab.observer.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class Amazon implements Publisher {

    private List<Subscriber> subscribers;

    public Amazon(){
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for(Subscriber subscriber : subscribers){
            subscriber.update();
        }
    }

    public void orderPlaced(){
        System.out.println("Order has been placed");
        this.notifySubscribers();
    }
}
