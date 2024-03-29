package sensor.view;

import sensor.Model.Substance;
import sensor.Observer;

public class TemperatureObserver extends Observer {
    public TemperatureObserver(Substance substance) {
        this.substance = substance;
        this.substance.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Температура: " + substance.getTemperature());
    }
}
