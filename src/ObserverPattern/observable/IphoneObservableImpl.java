package ObserverPattern.observable;

import ObserverPattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{

    List<NotificationAlertObserver> list=new ArrayList<>();
    int stockCount=0;

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        list.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        list.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver notificationAlertObserver: list){
            notificationAlertObserver.update();
        }
    }

    @Override
    public void setStockCount(int newStock) {
        if(stockCount==0){
            notifySubscribers();
        }
        stockCount=stockCount+newStock;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
