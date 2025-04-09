import ObserverPattern.observable.IphoneObservableImpl;
import ObserverPattern.observable.StockObservable;
import ObserverPattern.observer.EmailAlertObserverImpl;
import ObserverPattern.observer.MobileAlertObserverImpl;
import ObserverPattern.observer.NotificationAlertObserver;

/*

Mail Send to: abc@gmail.com Product is in stock hurryUp!!!
Mail Send to: abc@gmail.com Product is in stock hurryUp!!!
Msg send to: abc@gmail.com Product is in stock hurryUp!!!!


*/

public class Main {
    public static void main(String[] args) {

        StockObservable stockObservable=new IphoneObservableImpl();

        NotificationAlertObserver notificationAlertObserver1=new EmailAlertObserverImpl(stockObservable, "abc@gmail.com");
        NotificationAlertObserver notificationAlertObserver2=new EmailAlertObserverImpl(stockObservable, "abc@gmail.com");
        NotificationAlertObserver notificationAlertObserver3=new MobileAlertObserverImpl("abc@gmail.com",stockObservable);

        stockObservable.add(notificationAlertObserver1);
        stockObservable.add(notificationAlertObserver2);
        stockObservable.add(notificationAlertObserver3);

        stockObservable.setStockCount(10);


    }
}