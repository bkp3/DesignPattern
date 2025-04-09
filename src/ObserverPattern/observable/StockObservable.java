package ObserverPattern.observable;

import ObserverPattern.observer.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver notificationAlertObserver);

    void remove(NotificationAlertObserver notificationAlertObserver);

    void notifySubscribers();

    void setStockCount(int newStock);

    int getStockCount();
}
