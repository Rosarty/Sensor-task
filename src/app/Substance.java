package app;

import java.util.ArrayList;
import java.util.List;

public class Substance {
    private final List<Observer> observers = new ArrayList<>();
    private int temperature;
    private int weight;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void setState(int temperature, int weight) {
        this.temperature = temperature;
        this.weight = weight;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, weight);
        }
    }
}
