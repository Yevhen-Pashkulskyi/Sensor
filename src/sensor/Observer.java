package sensor;

import sensor.Model.Substance;

public abstract class Observer {
    protected Substance substance;

    public abstract void update();
}
