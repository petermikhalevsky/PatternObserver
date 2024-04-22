package patterns.observable;

import patterns.observer.Gamer;
import patterns.observer.Observer;

import java.util.ArrayList;
import java.util.List;


public class ReleaseGame implements Observable {
    private List<Observer> observers = new ArrayList<>();
    String releaseGame;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (var observer : observers) {
            System.out.println("Notification for gamer : " + observer);
            observer.update(releaseGame);
        }
    }

    public void release(String game) {
        this.releaseGame = game;
        notifyObserver();
    }
}
