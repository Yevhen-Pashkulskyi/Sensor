package sensor.Model;

import sensor.Observer;

import java.util.ArrayList;
import java.util.List;

public class Substance {
    private static final double ZERO_TEMPERATURE = 0.00;
    private static final double STARTING_WEIGHT = 1.00;
    private static final int WEIGHT_GAIN = 2;

    private final List<Observer> observers = new ArrayList<>();
    private double temperature;
    private double weight;
    private String color;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        updateProperties();
        notifyAllObservers();
    }

    private void updateProperties() {
        if (temperature <= ZERO_TEMPERATURE) {
            this.weight = STARTING_WEIGHT;
            this.color = "білий";
        } else {
            this.weight = STARTING_WEIGHT + (WEIGHT_GAIN * temperature);
            this.color = "чорний";
        }
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}