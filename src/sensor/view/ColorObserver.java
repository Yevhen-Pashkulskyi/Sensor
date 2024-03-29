package sensor.view;

import sensor.Model.Substance;
import sensor.Observer;

public class ColorObserver extends Observer {
    public ColorObserver(Substance substance) {
        this.substance = substance;
        this.substance.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Колір: " + substance.getColor());
    }
}
