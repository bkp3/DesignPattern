package ObserverPattern.observer;

import ObserverPattern.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String username;
    StockObservable stockObservable;

    public MobileAlertObserverImpl(String username, StockObservable stockObservable){
        this.username=username;
        this.stockObservable=stockObservable;
    }

    @Override
    public void update() {
        sendMsgMobile(username,"Product is in stock hurryUp!!!!");
    }

    private void sendMsgMobile(String username, String s) {
        System.out.println("Msg send to: "+username+" "+s);
    }
}
