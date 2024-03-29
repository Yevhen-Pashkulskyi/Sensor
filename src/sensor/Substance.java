package sensor;

import java.util.ArrayList;
import java.util.List;

// Subject - клас, що вимірює стан кольору та вагу речовини
class Substance {
    private final List<Observer> observers = new ArrayList<>();
    private int temperature;
    private int weight;
    private String color;


    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }


    public void setWeight(int weight) {
        this.weight = weight;
        notifyAllObservers();
    }


    public void setColor(String color) {
        this.color = color;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, weight, color);
        }
    }
}