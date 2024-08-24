package live.mukeshtechlab.observer.publisher;

import live.mukeshtechlab.observer.subscriber.Subscriber;

public interface Publisher {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscribers();
}
