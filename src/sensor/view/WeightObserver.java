package sensor.view;

import sensor.Model.Substance;
import sensor.Observer;

public class WeightObserver extends Observer {
    public WeightObserver(Substance substance) {
        this.substance = substance;
        this.substance.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Вага: " + substance.getWeight() + " гр.");
    }
}
