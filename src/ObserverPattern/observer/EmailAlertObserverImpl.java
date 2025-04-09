package ObserverPattern.observer;

import ObserverPattern.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StockObservable stockObservable;

    public EmailAlertObserverImpl(StockObservable stockObservable, String emailId){
        this.stockObservable=stockObservable;
        this.emailId=emailId;
    }


    @Override
    public void update() {
        sendMail(emailId,"Product is in stock hurryUp!!!");
    }

    private void sendMail(String emailId, String s) {
        System.out.println("Mail Send to: "+emailId+" "+s);
    }
}
