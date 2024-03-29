package sensor.controller;

import sensor.Model.Substance;
import sensor.view.ColorObserver;
import sensor.view.WeightObserver;

public class SensorPatternDemo {
    public static void main(String[] args) {

        Substance substance = new Substance();

        new ColorObserver(substance);
        new WeightObserver(substance);

        System.out.println("Зміна температури до 0 градусів.");
        substance.setTemperature(0);

        double changeTemperature = 6.7;
        System.out.printf("Зміна температури до %.1f градусів.\n",changeTemperature);
        substance.setTemperature(changeTemperature);
    }
}
