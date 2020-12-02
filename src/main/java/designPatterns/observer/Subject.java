package designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.add(observer);
    }

    public void notifyObservers(){
        observers.forEach(Observer::update);
    }
}
